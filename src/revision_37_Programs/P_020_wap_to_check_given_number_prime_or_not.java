package revision_37_Programs;

import java.util.Scanner;

public class P_020_wap_to_check_given_number_prime_or_not {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enternumber: ");
		int n = sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("Number is prime number");
		}else
		{
			System.out.println("Number is not a prime number");
		}
		
		
		
	}

}
