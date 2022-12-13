package type_5_array;

public class Ex_9_Average_of_an_array {

	public static void main(String[] args) {
	
		
		int arr[] = {10,20,30};
		int total = 0;
		
		for(int count=0;count<arr.length;count++)
		{
			total+=arr[count];
		}
		
		System.out.println(total/arr.length);
		
		
		
		
	}

}
