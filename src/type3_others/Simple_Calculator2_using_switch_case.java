package type3_others;

import java.util.Scanner;

public class Simple_Calculator2_using_switch_case {

	public static void main(String[] args) {


		int a,b,ch;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		b=sc.nextInt();
		
		System.out.println("Enter your Choice 1-> Add  2-> Subtract  3-> Multiply  4-> Divide \nEnter your Choice:");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Addition="+(a+b));
			break;
		case 2:
			System.out.println("Subtraction="+(a-b));
			break;
		case 3:
			System.out.println("Multiplication="+(a*b));
			break;
		case 4:
			System.out.println("Division="+(a/b));
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		
	}

}
