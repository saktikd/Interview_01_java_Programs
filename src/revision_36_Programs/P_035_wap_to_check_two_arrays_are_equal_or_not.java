package revision_36_Programs;

import java.util.Arrays;

public class P_035_wap_to_check_two_arrays_are_equal_or_not {

	public static void main(String[] args) {

		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {1,2,3,4,5};

		boolean b = Arrays.equals(a1, a2);
		
		if(b==true)
		{
			System.out.println("Two arrays are equal");
		}else
		{
			System.out.println("Arrays are not equal");
		}
		
		
		
		
		
	}

}
