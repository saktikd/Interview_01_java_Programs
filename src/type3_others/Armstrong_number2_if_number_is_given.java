package type3_others;

public class Armstrong_number2_if_number_is_given {

	public static void main(String[] args) {
		
		
		int n = 1634;
		int original = n;
		int arm = 0;
		int temp;
		
		
		while(n>0)
		{
			temp=n%10;
			temp = (int) Math.pow(temp, 4);// here number is given hence we count the length 4. it will change according to the size of the number.
			arm = arm +temp;               
			n = n/10;
		}
		if(arm==original)
		{
			System.out.println("Number "+original+" is Armstrong number");
		}else
		{
			System.out.println("Number "+original+" is not a Armstrong number");

		}
		
	}

}
