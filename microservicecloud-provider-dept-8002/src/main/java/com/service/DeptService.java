package com.service;

import com.dao.DeptDao;
import com.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept){
        return deptDao.addDept(dept);
    }

    public Dept findById(Long id){
        return deptDao.findById(id);
    }

    public List<Dept> findALl(){
        return deptDao.findAll();
    }
}
