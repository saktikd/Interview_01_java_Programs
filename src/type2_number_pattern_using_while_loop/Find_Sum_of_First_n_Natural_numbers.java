package type2_number_pattern_using_while_loop;

import java.util.Scanner;

public class Find_Sum_of_First_n_Natural_numbers {

	public static void main(String[] args) {
		
		int n,i,add= 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		n = sc.nextInt();
		i=1;
		while(i<=n)
		{
			add=add+i;
			i=i+1;
		}
		
		System.out.println("Addition: "+add);
		
		
		
	}

}
