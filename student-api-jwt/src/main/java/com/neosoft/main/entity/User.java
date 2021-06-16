package com.neosoft.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name =  "USER_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private int id;
	private String userName;
	private String password;
		
}
