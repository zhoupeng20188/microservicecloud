package com.controller;

import com.service.DeptService;
import com.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable Long id){
        return deptService.findById(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.findALl();
    }
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }
}
