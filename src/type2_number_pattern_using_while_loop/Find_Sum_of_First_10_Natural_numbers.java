package type2_number_pattern_using_while_loop;

public class Find_Sum_of_First_10_Natural_numbers {

	public static void main(String[] args) {
		
		int i,add= 0;
		
		i=1;
		while(i<=10)
		{
			add=add+i;
			i=i+1;
		}
		
		System.out.println("Addition: "+add);
		
		
		
	}

}
