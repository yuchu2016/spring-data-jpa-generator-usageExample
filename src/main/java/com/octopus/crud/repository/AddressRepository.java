package com.octopus.crud.repository;

import com.octopus.crud.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * 
 * @author yuchu
 * @email 
 * @date 2018-04-26 17:13:51
 */

public interface AddressRepository extends JpaRepository<Address,Integer> {
	
}
