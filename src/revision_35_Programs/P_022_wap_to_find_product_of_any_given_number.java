package revision_35_Programs;

import java.util.Scanner;

public class P_022_wap_to_find_product_of_any_given_number {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		int product =1;
		
		while(n!=0)
		{
			int t= n%10;
			product=product*t;
			n=n/10;
		}
		System.out.println("Product is: "+product);
		
		
		
		
		
	}

}
