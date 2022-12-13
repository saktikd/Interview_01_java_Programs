package type2_number_pattern_using_for_loop;

public class Print_All_even_and_odd_number_between_1_to_100 {

	public static void main(String[] args) {
		
		// WAP to find all even and odd number between 1 to 100
		
				for(int i=1;i<=100;i++)
				{
					if(i%2==0)
					{
						System.out.println(i+" : Number is Even");
					}else{
						System.out.println(i+" : Number is Odd");
					}
				}
				
	
	}

}
