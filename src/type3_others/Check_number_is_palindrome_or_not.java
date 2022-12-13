package type3_others;

import java.util.Scanner;

public class Check_number_is_palindrome_or_not {

	public static void main(String[] args) {
		
		int n,rev=0,z;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n = sc.nextInt();
		
		z=n;
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		if(z==rev)
		{
			System.out.println("Number is Palindome");
		}else{
			System.out.println("Not a Palindrome number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
