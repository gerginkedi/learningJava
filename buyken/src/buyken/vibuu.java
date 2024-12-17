package buyken;

import java.util.Scanner;

public class vibuu {

	public static void main(String[] args) {
		int x = 1;
		String employee = "employee";
		String instanceName;
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("do you want to create a new user ?");
		while(x == 1) {
			String decision = scanner.next().toUpperCase();
			if (decision == "YES") {
				int index = 1;
				System.out.print("enter name: ");
				String name = scanner.next();
				
				System.out.print("enter surname: ");
				String surname = scanner.next();
				
				System.out.print("enter no: ");
				int no = scanner.nextInt();
				
				System.out.print("enter pay: ");
				double pay = scanner.nextDouble();
				
				System.out.println("enter experience: ");
				int experience = scanner.nextInt();
				
			}
			else if(decision == "NO") {
				
				x = 0;
			}
			else {
				System.out.println("please enter correct value YES/NO");
			}
		}
	}
}
