package revision_35_Programs;

public class P_019_wap_to_find_prime_number_between_1_to_100 {

	public static void main(String[] args) {

		
		int i,j,count;
		
		for(i=1;i<=100;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				count++;
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		
		
		
		
		
		
		
	}

}
