package revision_36_Programs;

import java.util.Scanner;

public class P_016_wap_for_simple_calculator_program {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		System.out.println("Enter choice: 1->Add, 2->subtract, 3->multiply, 4->division");
		int ch = sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("Addition is "+(a+b));
		}else if(ch==2)
		{
			System.out.println("Subtraction is "+(a-b));
		}else if(ch==3)
		{
			System.out.println("Multiplication is "+(a*b));
		}else if(ch==4)
		{
			System.out.println("Division is "+(a/b));
		}else
		{
			System.out.println("Invalid choice");
		}
		
	}

}
