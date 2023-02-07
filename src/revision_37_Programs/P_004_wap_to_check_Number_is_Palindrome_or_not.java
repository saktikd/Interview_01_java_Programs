package revision_37_Programs;

import java.util.Scanner;

public class P_004_wap_to_check_Number_is_Palindrome_or_not {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		System.out.println("Original number is: "+n);
		
		
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		
		System.out.println("Reverse number is :"+rev);
		
		if(temp==rev)
		{
			System.out.println("number is palindrome");
		}else
		{
			System.out.println("number is not palindrome");
		}
		
	}

}
