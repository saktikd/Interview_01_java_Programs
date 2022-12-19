package revision_36_Programs;

import java.util.Scanner;

public class P_003_wap_to_Reverse_a_Number {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Entera number :");
		int n = sc.nextInt();
		
		System.out.println("Original number is :"+n);
		
		int r=0;
		
		System.out.println();
		
		System.out.print("Reverse String is: ");
		while(n!=0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		
		
		
		
		
	}

}
