package revision_37_Programs;

public class P_026_wap_tp_print_sum_of_elements_of_array {

	public static void main(String[] args) {

		int[] arr= new int[]{12,52,36,45,78,95,22};
		
		int sum=0;
		
// using for each loop
		for(int n:arr)
		{
			System.out.print(n+" ");
			sum+=n;
		}
		System.out.println();

		
		System.out.println("Sum of elements: "+sum);
		
		
System.out.println();
// using for loop

        int sum1=0;
        for(int i=0;i<arr.length;i++)
        {
        	sum1=sum1+arr[i];
        }
        
        System.out.println("Sum of elements: "+sum1);







		
		
		
	}

}
