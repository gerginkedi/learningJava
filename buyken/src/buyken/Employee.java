package buyken;

public class Employee {

	public String name;
	public String surname;
	public Integer no;
	public Double pay;
	public Integer experience;
	
	

	
	
	
	public Employee(String name, String surname, Integer no, Double pay, Integer experience) {
		this.name = name;
		this.surname = surname;
		this.no = no;
		this.pay = pay;
		this.experience = experience;
	}

	public void showEmployeesInformations() {
		
		System.out.println("*****************Employees Info*****************");
		System.out.println("name: " + name);
		System.out.println("surname: " + surname);
		System.out.println("no: " + no);
		System.out.println("pay: " + pay);
		System.out.println("experience: " + experience);
	}
	
	public void payRaise(int y) {
		this.pay += y;
		System.out.println("your pay increased. new value: " + pay);
	}
}
