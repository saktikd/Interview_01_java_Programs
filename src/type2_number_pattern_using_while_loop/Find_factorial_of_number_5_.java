package type2_number_pattern_using_while_loop;

public class Find_factorial_of_number_5_ {

	public static void main(String[] args) {
		
		int n=5,fact=1;
		while(n>0)
		{
			fact=fact*n;
			n=n-1;
		}
		System.out.println("Factorial of 5 is: "+fact);
		
		
	}

}
