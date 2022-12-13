package type_5_array;

public class Ex_4_Find_min_value_in_an_array {

	public static void main(String[] args) {
		
		// Find min number between 23,54,21,58,63,15
		
				int[] arr = {23,54,21,58,63,15};
				int min = arr[0];
				
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]<min)
					{
						min=arr[i];
					}
				}
				
				System.out.println("Min number is "+min);
	}

}
