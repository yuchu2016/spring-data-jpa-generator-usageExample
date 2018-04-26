package com.octopus.crud.service;

import com.octopus.crud.entity.Test1;
import com.octopus.crud.repository.Test1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 
 *
 * @author yuchu
 * @email 
 * @date 2018-04-26 17:13:51
 */
@Service
public class Test1Service{
    @Autowired
    private Test1Repository test1Repository;

    public void addTest1(Test1 test1){
        test1Repository.save(test1);
    }

    public void updateTest1(Test1 test1){
            test1Repository.save(test1);
    }

    public void deleteTest1(Integer id){
        test1Repository.delete(id);
    }

    public Test1 getById( Integer id){
       return test1Repository.findOne(id);
    }

    public List<Test1> getAll(){
       return test1Repository.findAll();
    }

    public Page<Test1> getPage(Integer pageNum,Integer pageSize){
        Pageable pageable = new PageRequest(pageNum,pageSize);
        return test1Repository.findAll(pageable);
    }
}

