package type3_others;

public class Find_Sum_of_ODD_and_Product_of_EVEN_givennumber_2324 {

	public static void main(String[] args) {
	
		int sum=0,product=1,digit,n=2324;
		
		
		while(n>0)
		{
			digit=n%10;
			if(digit%2==1)
				sum = sum+digit;
			else
				product = product*digit;
			
		   n= n/10;
		}
		System.out.println("Sum = "+sum+"\n"+"Product = "+product);
	}
}
