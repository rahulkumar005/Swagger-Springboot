package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "empdata")
public class EmpEntity {

	@Id
	private Integer id;
	private String name;
	private String salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public EmpEntity(Integer id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmpEntity() {
	}

}
