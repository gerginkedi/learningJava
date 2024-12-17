package gise;
import java.util.Scanner;

import com.user.model.User;
public class program {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int idNumber = scanner.nextInt();
		
		User user = new User(idNumber);
	}
	
	
}
