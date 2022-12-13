package type2_number_pattern_using_while_loop;

import java.util.Scanner;

public class Print_upto_any_number {

	public static void main(String[] args) {
		
	    int i,n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto which you want to print:");
		n=sc.nextInt();
		
		i=1;
		while(i<=n)
		{
			System.out.println(i);
			i=i+1;
		}
		
	}

}
