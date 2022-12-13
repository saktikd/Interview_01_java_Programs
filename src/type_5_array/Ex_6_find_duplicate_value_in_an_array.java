package type_5_array;

public class Ex_6_find_duplicate_value_in_an_array {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,2,7,8,3,8};
		System.out.println("Duplicate elements given in the array :");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
				
			}
			
		}
		
	}
	
}
