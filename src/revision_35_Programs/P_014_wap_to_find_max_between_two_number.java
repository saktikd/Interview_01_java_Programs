package revision_35_Programs;

import java.util.Scanner;

public class P_014_wap_to_find_max_between_two_number {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		int n2 = sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println("max number is "+n1);
		}else if(n1<n2)
		{
			System.out.println("max number is "+n2);
		}else
		{
			System.out.println("Both numbers are equal");
		}
	}

}
