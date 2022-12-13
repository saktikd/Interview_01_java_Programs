package type_5_array;

public class Ex_7_print_elements_ofan_array_in_reverse_order {

	public static void main(String[] args) {
		
		int[] arr= new int[]{1,2,3,4,5};
		
		System.out.println("Original elements : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Array in reverse order : ");
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
	}

}
