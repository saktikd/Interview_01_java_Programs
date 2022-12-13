package type3_others;

import java.util.Scanner;

public class Find_Sum_of_Even_and_Product_of_odd {

	public static void main(String[] args) {
	
		int n,sum=0,product=1,digit;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of number: ");
		n=sc.nextInt();
		
		while(n>0)
		{
			digit=n%10;
			if(digit%2==0)
				sum = sum+digit;
			else
				product = product*digit;
			
			n = n/10;
		}
		System.out.println("Sum = "+sum+"\n"+"Product = "+product);
	}
}
