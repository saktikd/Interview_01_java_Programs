package type2_number_pattern_using_while_loop;

public class Find_number_7_is_prime_or_not {

	public static void main(String[] args) {
		
		int i=1,count=0,n=13;
		while(i<=n)
		{
			if(n%i==0)
		
			count++;
			i=i+1;
			
		}if(count==2)
		{
			System.out.println("Prime number");
		}else{
			System.out.println("Nota prime number");
		}
		
		
		
		
		
		
		
	}

}
