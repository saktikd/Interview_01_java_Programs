package revision_37_Programs;

import java.util.Scanner;

public class P_017_Calculator_program_using_switch_case {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter choice: 1->Add, 2->subtract, 3->multiply, 4->division");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Addition is "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction is "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication is "+(a*b));
			break;
		case 4:
			System.out.println("Division is "+(a/b));
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
		
		
		
		
		
		
		
	}

}
