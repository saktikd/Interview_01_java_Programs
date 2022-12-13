package type_5_array;

public class Find_max_number_between_an_array {

	public static void main(String[] args) {
		
		
		// Find max number between 23,54,21,58,63,15
		
				int[] arr = {23,54,21,58,63,15};
				int max = arr[0];
				
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]>max)
					{
						max=arr[i];
					}
				}
				
				System.out.println("Max number is "+max);
		
		
		
		
		
	}

}
