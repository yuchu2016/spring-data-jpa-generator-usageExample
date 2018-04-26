package com.octopus.crud.service;

import com.octopus.crud.entity.Test2;
import com.octopus.crud.repository.Test2Repository;
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
public class Test2Service{
    @Autowired
    private Test2Repository test2Repository;

    public void addTest2(Test2 test2){
        test2Repository.save(test2);
    }

    public void updateTest2(Test2 test2){
            test2Repository.save(test2);
    }

    public void deleteTest2(Integer id){
        test2Repository.delete(id);
    }

    public Test2 getById( Integer id){
       return test2Repository.findOne(id);
    }

    public List<Test2> getAll(){
       return test2Repository.findAll();
    }

    public Page<Test2> getPage(Integer pageNum,Integer pageSize){
        Pageable pageable = new PageRequest(pageNum,pageSize);
        return test2Repository.findAll(pageable);
    }
}

