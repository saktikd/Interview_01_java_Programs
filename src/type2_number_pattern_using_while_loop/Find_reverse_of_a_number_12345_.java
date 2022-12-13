package type2_number_pattern_using_while_loop;

public class Find_reverse_of_a_number_12345_ {

	public static void main(String[] args) {
		
		int n=12345,rev=0;
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Reverse of 12345 number is :"+rev);
		
		
	}

}
