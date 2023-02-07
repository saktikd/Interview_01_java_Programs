package revision_37_Programs;

import java.util.Scanner;

public class P_010_wap_to_find_sum_of_any_given_number {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		int sum=0;
		
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		
		System.out.println("sum of number is "+sum);
		
		
	}

}
