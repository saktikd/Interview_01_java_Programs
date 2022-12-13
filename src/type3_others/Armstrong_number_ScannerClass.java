package type3_others;

import java.util.Scanner;

public class Armstrong_number_ScannerClass {

	public static void main(String[] args) {
		
	// Program to Check number is ArmstrongNumber or not
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
	     	int original = n;
			int arm = 0;
			int temp;
		
			int z=n;
			int count=0;
			while(z!=0)
			{
			z=z/10;
			count++;
			}
			
			while(n>0)
			{
				temp=n%10;
				temp = (int) Math.pow(temp, count);
				arm = arm +temp;
				n = n/10;
			}
			if(arm==original)
			{
				System.out.println("Number "+original+" is a Armstrong number");
			}else
			{
				System.out.println("Number "+original+" is not a Armstrong number");

			}
			
	}

}
