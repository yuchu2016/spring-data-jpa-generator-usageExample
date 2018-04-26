package com.octopus.crud.service;

import com.octopus.crud.entity.User;
import com.octopus.crud.repository.UserRepository;
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
public class UserService{
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public void updateUser(User user){
            userRepository.save(user);
    }

    public void deleteUser(String id){
        userRepository.delete(id);
    }

    public User getById( String id){
       return userRepository.findOne(id);
    }

    public List<User> getAll(){
       return userRepository.findAll();
    }

    public Page<User> getPage(Integer pageNum,Integer pageSize){
        Pageable pageable = new PageRequest(pageNum,pageSize);
        return userRepository.findAll(pageable);
    }
}

