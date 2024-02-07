package vijay;

import java.util.Scanner;

public class Scanner_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner brijesh = new Scanner(System.in);
		System.out.println("User plese tell me the factorial value");
		int a=brijesh.nextInt();
		
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+a+" is: "+fact);

	}

}
