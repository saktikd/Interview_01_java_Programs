package type2_number_pattern_using_for_loop;

public class Print_all_Prime_number_between_1_To_100 {

	public static void main(String[] args) {
		
		int i,j,count;
		
		for(j=1;j<=100;j++)
		{
			count = 0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				
			count++;
			}
			if(count==2)
			System.out.print(j+", ");
		}
	}
}
