package type3_others;

public class Check_525_is_palindrome_number_or_not {

	public static void main(String[] args) {
		
		
		int n=121,rev=0;
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		if(rev==121)		
		{
			System.out.println("Number is Palindome");
		}else{
			System.out.println("Not a Palindrome number");
		}
		
	}

}
