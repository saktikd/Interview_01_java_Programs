package type2_number_pattern_using_while_loop;

public class Find_product_of_given_number_234 {

	public static void main(String[] args) {
		
		int n=234,product=1;
		
		while(n>0)
		{
		product=product*(n%10);
		n=n/10;
		}
		System.out.println("Product of number 234 is :"+product);
		
		
		
		
		
	}

}
