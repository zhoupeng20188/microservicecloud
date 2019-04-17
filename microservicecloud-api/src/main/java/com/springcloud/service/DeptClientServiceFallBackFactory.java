package com.springcloud.service;

import com.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public boolean add(Dept dept) {
                return false;
            }

            public List<Dept> list() {
                return null;
            }

            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("no record,此为Hystrix提供的降级信息，此Provider已经关闭");
            }
        };
    }
}
