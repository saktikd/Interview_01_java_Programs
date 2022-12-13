package revision_35_Programs;

import java.util.Scanner;

public class P_011_wap_to_check_number_is_armstrong_or_not {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		int z=n;
		int z1=n;
		int arm=0;
		
		int count=0;
		while(z!=0)
		{
			z=z/10;
			count++;
		}
		
		int temp;
		while(z1!=0)
		{
			temp=z1%10;
			temp=(int) Math.pow(temp, count);
			arm=arm+temp;
			z1=z1/10;
		}
		
		if(n==arm)
		{
			System.out.println("number is ArmstrongNumber");
		}else
		{
			System.out.println("Number is not an ArmstrongNumber");
		}
		
	}

}
