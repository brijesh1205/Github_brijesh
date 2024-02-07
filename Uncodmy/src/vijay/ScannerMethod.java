package vijay;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a;
		Scanner brijesh = new Scanner(System.in);
		System.out.println("User plese tell me your full name:");
		String name = brijesh.nextLine();
		
		System.out.println("User plese tell me your age:");
		int age = brijesh.nextInt();
		
	System.out.println("The user name is-> "+name+"and user age is ->"+age);

		
		
	}

}
