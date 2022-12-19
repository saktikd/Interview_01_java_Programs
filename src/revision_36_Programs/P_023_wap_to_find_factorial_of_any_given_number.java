package revision_36_Programs;

import java.util.Scanner;

public class P_023_wap_to_find_factorial_of_any_given_number {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n =sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number "+n+" is "+fact);
		
		
		
		
		
		
	}

}
