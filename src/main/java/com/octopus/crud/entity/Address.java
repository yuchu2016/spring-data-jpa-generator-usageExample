package com.octopus.crud.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author yuchu
 * @email 
 * @date 2018-04-26 17:13:51
 */
@Data
@Table(name="tb_address")
@Entity
public class Address{

	/**
	 * 
	 */
	    @Id
    @GeneratedValue
	
	private Integer id;
	/**
	 * 
	 */
	
	private Integer userid;
	/**
	 * 
	 */
	
	private String address;

}
