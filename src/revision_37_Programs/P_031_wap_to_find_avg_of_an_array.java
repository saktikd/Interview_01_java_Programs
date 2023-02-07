package revision_37_Programs;

public class P_031_wap_to_find_avg_of_an_array {

	public static void main(String[] args) {

		int[] arr = new int[]{2,5,3,4,1,2};
		
		double sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		double avg= sum/arr.length;
		
		System.out.println("Average of array elements are: "+avg);
		
		
		
		
		
	}

}
