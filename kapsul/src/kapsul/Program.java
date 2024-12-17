package kapsul;

import com.budur.model.Employee;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		long value = scanner.nextLong();
		employee.setId(value);
		
		System.out.println(employee.getId()); 
		
	}
}
