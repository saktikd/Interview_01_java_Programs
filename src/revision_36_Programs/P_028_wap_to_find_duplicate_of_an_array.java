package revision_36_Programs;

public class P_028_wap_to_find_duplicate_of_an_array {

	public static void main(String[] args) {


		int[] arr = new int[]{12,5,32,12,6,4,6,78,44,32};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
