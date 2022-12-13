package type3_others;

import java.util.Scanner;

public class Find_Max_Between_Three_Number {

	public static void main(String[] args) {
		
		int a,b,c;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name:");
		a=sc.nextInt();
		System.out.println("Enter Second name:");
		b=sc.nextInt();
		System.out.println("Enter Third name:");
		c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("Max Number = "+a);
		else if(b>a && b>c)
			System.out.println("Max Number = "+b);
		else
			System.out.println("Max Number = "+c);
		
		
		
		
	}

}
