package com.spring.study.bean;

import java.io.Serializable;

public class StudentInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1918663293424279663L;
	
	private int id;
	private String number;
	private String name;
	private char sex;
	private int age;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", number=" + number + ", name="
				+ name + ", sex=" + sex + ", age=" + age + ", address="
				+ address + "]";
	}
	
	
}
