package com.castoldi.springbootreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class Client {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String email;

}