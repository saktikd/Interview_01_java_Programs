package revision_37_Programs;

import java.util.Scanner;

public class P_018_wap_to_find_sum_of_even_product_of_odd {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();                                 //123456
		
		int sum =0;
		int product=1;
		
		
		while(n!=0)
		{
			int t=n%10;
			if(t%2==0)
			{
				sum=sum+t;
			}else
			{
				product = product*t;
			}
			n=n/10;
		}
		System.out.println("Sum of even is "+sum+"\n"+"Product of odd is "+product);
		
		
		
		
		
		
		
	}

}
