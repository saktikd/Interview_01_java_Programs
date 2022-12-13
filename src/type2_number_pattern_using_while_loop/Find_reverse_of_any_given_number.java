package type2_number_pattern_using_while_loop;

import java.util.Scanner;

public class Find_reverse_of_any_given_number {

	public static void main(String[] args) {
		
     	int n,rev=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that you want toreverse : ");
		n=sc.nextInt();

		
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Reverse is :"+rev);
		
		
	}

}
