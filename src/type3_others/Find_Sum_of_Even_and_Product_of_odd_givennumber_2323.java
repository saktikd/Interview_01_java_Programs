package type3_others;

public class Find_Sum_of_Even_and_Product_of_odd_givennumber_2323 {

	public static void main(String[] args) {
	
		int sum=0,product=1,digit,n=2323;
		
		
		while(n>0)
		{
			digit=n%10;
			if(digit%2==0)
				sum = sum+digit;
			else
				product = product*digit;
			
		   n= n/10;
		}
		System.out.println("Sum = "+sum+"\n"+"Product = "+product);
	}
}
