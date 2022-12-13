package type_5_array;

public class Ex_8_Print_Elements_of_array_present_in_even_position {

	public static void main(String[] args) {
		
		
		int[] arr = new int[]{1,2,3,4,5,6};
		
		System.out.println("Elements present in even position : ");
		
		for(int i=1;i<arr.length;i=i+2)                 // for print odd only the logic is i=0 in for loop
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}

}
