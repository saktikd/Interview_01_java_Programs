package revision_37_Programs;

import java.util.Scanner;

public class P_034_wap_to_find_no_of_even_and_odd_digits_in_a_number {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		int ev=0;
		int od=0;
		int t;
		while(n!=0)
		{
			t=n%10;
			if(t%2==0)
			{
				ev++;
			}else
			{
				od++;
			}
			n=n/10;
		}
		
		System.out.println("Number of even digit is "+ev+"\n"+"Number of odd digit is "+od);
		
	}

}
