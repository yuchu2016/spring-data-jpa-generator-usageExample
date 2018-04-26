package com.octopus.crud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.octopus.crud.entity.User;
import com.octopus.crud.service.UserService;


/**
 * 
 *
 * @author yuchu
 * @email 
 * @date 2018-04-26 17:13:51
 */
@RestController
@RequestMapping("user")
@Api("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有user")
    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }
    @ApiOperation(value = "分页获取user")
    @GetMapping("/page")
    public Page<User> getPage(@RequestParam(name = "pageNum") Integer pageNum,@RequestParam(name = "pageSize")Integer pageSize){
        return userService.getPage(pageNum, pageSize);
    }

    @ApiOperation(value = "更新user")
    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @ApiOperation(value = "添加user")
    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @ApiOperation(value = "根据id获取user")
    @GetMapping("/id")
    public User getUser(@PathVariable String id){
        return userService.getById(id);
    }
    @ApiOperation(value = "根据id删除}user")
    @DeleteMapping
    public void deleteUser(@RequestParam(name = "id") String id){
        userService.deleteUser(id);
    }

}
