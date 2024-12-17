package com.budur.model;


public class Employee {

	//private olan variablellara erisip deger atmaanin 2 yolu var ya constructor ya da getter setter kullanmak
	
	
	
	private long id;
	private String name;
	private String surName;
	private int pay;
	
	
	





	
	public long getId() {  //aslinda normal bir fonskiyondan farki yoktur sadece alip atar
		return id;
	}
	public void setId(long id) {
		if(id>1000) {
			
			System.out.println("enter correct value");
		}
		else {
			this.id = id;
		}
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}



	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	
	
	
}
