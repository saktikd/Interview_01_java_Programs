package revision_36_Programs;

public class P_030_wap_to_print_elements_of_array_present_in_even_and_odd_position {

	public static void main(String[] args) {

		
		int[] arr = new int[]{12,23,34,21,41,36,74,89,24};
		
		System.out.print("Elements of array present in even position: ");
		
		for(int i=1;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
		
		System.out.print("Elements of array present in odd position: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		
		
		
		
		
		
		
	}

}
