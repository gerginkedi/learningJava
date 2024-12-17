package com.user.model;
import java.util.Random;

public class User {
	Random random = new Random();
	
	String name;
	String Surname;
	int idNumber = 1234;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	
	
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	
	public User(int idNumber) {
		if (idNumber != this.idNumber ) {
			if (String.valueOf(Math.abs(idNumber)).length() != 4) {
				System.out.println("id number have to be 4 digits");
			}
			else if(idNumber != this.idNumber) {
				
				System.out.println("id number is not matching");
			}
		}
		else {
			System.out.println(random.nextInt(10000));
		}
	}
	
	
	
	
	
	
}
