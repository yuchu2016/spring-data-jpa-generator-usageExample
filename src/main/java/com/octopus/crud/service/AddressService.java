package com.octopus.crud.service;

import com.octopus.crud.entity.Address;
import com.octopus.crud.repository.AddressRepository;
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
public class AddressService{
    @Autowired
    private AddressRepository addressRepository;

    public void addAddress(Address address){
        addressRepository.save(address);
    }

    public void updateAddress(Address address){
            addressRepository.save(address);
    }

    public void deleteAddress(Integer id){
        addressRepository.delete(id);
    }

    public Address getById( Integer id){
       return addressRepository.findOne(id);
    }

    public List<Address> getAll(){
       return addressRepository.findAll();
    }

    public Page<Address> getPage(Integer pageNum,Integer pageSize){
        Pageable pageable = new PageRequest(pageNum,pageSize);
        return addressRepository.findAll(pageable);
    }
}

