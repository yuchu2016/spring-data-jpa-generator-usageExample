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
@Table(name="tb_user")
@Entity
public class User{

	/**
	 * 
	 */
	
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
	
	private String id;
	/**
	 * 
	 */
	
	private String username;
	/**
	 * 
	 */
	
	private String password;

}
