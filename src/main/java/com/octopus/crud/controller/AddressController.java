package com.octopus.crud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.octopus.crud.entity.Address;
import com.octopus.crud.service.AddressService;


/**
 * 
 *
 * @author yuchu
 * @email 
 * @date 2018-04-26 17:13:51
 */
@RestController
@RequestMapping("address")
@Api("address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @ApiOperation(value = "获取所有address")
    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }
    @ApiOperation(value = "分页获取address")
    @GetMapping("/page")
    public Page<Address> getPage(@RequestParam(name = "pageNum") Integer pageNum,@RequestParam(name = "pageSize")Integer pageSize){
        return addressService.getPage(pageNum, pageSize);
    }

    @ApiOperation(value = "更新address")
    @PutMapping
    public void updateAddress(@RequestBody Address address){
        addressService.updateAddress(address);
    }

    @ApiOperation(value = "添加address")
    @PostMapping
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }
    @ApiOperation(value = "根据id获取address")
    @GetMapping("/id")
    public Address getAddress(@PathVariable Integer id){
        return addressService.getById(id);
    }
    @ApiOperation(value = "根据id删除}address")
    @DeleteMapping
    public void deleteAddress(@RequestParam(name = "id") Integer id){
        addressService.deleteAddress(id);
    }

}
