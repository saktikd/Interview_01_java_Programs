package revision_36_Programs;

public class P_033_wap_to_swap_two_numbers {

	public static void main(String[] args) {

// Swapping of two numbers in between two variables. Lets say '10' and '20'
		
// Logic 1: Using third variable
		
		int a=10, b=20;
		System.out.println("Bebore swapping values are : "+a+" "+b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After swapping values are : "+a+" "+b);
		
		
		System.out.println();
// Logic 2: Using '+' & '-' operator 
		
		System.out.println("Bebore swapping values are : "+a+" "+b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping values are : "+a+" "+b);
    
		
		System.out.println();
// Logic 3: Using '*' & '/' operator and here (a & b !=0). This logic applicable only if a and b value are not zero.
		
		System.out.println("Bebore swapping values are : "+a+" "+b);

		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swapping values are : "+a+" "+b);
    
		
		System.out.println();
// Logic 4: Single statement
		
		System.out.println("Bebore swapping values are : "+a+" "+b);

		b=a+b-(a=b);

		System.out.println("After swapping values are : "+a+" "+b);


		
		
		
		
		
		
		
		
	}

}
