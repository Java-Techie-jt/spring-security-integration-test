package com.javatechie.spring.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String profession;

}
