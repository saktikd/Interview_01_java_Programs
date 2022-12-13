package type2_number_pattern_using_while_loop;

public class Find_Sum_of_a_number_12345_ {

	public static void main(String[] args) {
		
		int n=12345,sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum of 12345 number is :"+sum);
		
	}

}
