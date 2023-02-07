package revision_37_Programs;

public class P_027_wap_to_copy_elements_of_one_array_to_another {

	public static void main(String[] args) {


		int[] arr = new int[]{12,21,35,69,47,85};
		
		int[] arr1 = new int[arr.length];
		
		for(int i= 0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		
		System.out.print("Values of arr: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Values of arr1: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
