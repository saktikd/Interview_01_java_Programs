package type3_others;

import java.util.Scanner;

public class Check_Number_is_Positvie_or_Negative {

	public static void main(String[] args) {


		int a;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		a=sc.nextInt();
		if(a>0)
			System.out.println("Positive number ");
		else if(a<0)
			System.out.println("Negative number ");
		else
			System.out.println("Number is Zero");
		
		
		
		
		
	}

}
