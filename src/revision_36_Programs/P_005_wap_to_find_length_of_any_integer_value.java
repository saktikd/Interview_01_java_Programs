package revision_36_Programs;

import java.util.Scanner;

public class P_005_wap_to_find_length_of_any_integer_value {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		int count=0;
		
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("length of number is "+count);
		
		
		
		
	}

}
