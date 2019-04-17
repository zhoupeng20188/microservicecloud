package com.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.DeptService;
import com.springcloud.service.DeptClientService;
import com.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "myFallBack")
    // 异常时会进入myFallBack方法里
    public Dept get(@PathVariable Long id){
        Dept dept = deptService.findById(id);
        if(dept == null){
            throw  new RuntimeException("no record");
        }
        return dept;
    }

    private Dept myFallBack(@PathVariable Long id){
        return new Dept().setDeptno(id).setDname("no record ----hystrix");
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.findALl();
    }
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("************" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort()
                    + "\t" + element.getUri());
        }
        return this.discoveryClient;
    }
}
