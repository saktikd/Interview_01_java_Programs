package revision_37_Programs;

public class P_025_wap_to_print_value_of_an_array {

	public static void main(String[] args) {

		
		int[] arr = new int[]{12,55,23,11,68,96,};
		
		
// using for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
// using for each loop
System.out.println();
		
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
		
		
		
		
		
	}

}
