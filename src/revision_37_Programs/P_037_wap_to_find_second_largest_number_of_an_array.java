package revision_37_Programs;

import java.util.Arrays;
import java.util.Collections;

public class P_037_wap_to_find_second_largest_number_of_an_array {

	public static void main(String[] args) {

		
		
		
		
//      Arrays Ascending order

		int[] arr = {12,41,23,96,36,47,58,62};
		
		Arrays.sort(arr);

		System.out.println(arr[arr.length-1]);    // get largest number
		
		System.out.println(arr[arr.length-2]);    // get the second largest number
		
		System.out.println(arr[arr.length-3]);    // get the third largest number
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		System.out.println();
//      Arrays descending order
		
		Integer[] arr1 = {42,55,63,12,41,34,29,86}; // To use below formula we have to declare Integer instead of int
		
		Arrays.sort(arr1, Collections.reverseOrder());
		
		for(int rev : arr1)
		{
			System.out.print(rev+" ");
		}
		
		
		
		
	}

}
