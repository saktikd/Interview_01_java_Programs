package type2_number_pattern_using_while_loop;

public class X_to_the_Power_Y_program {

	public static void main(String[] args) {
		
		
		int x=3,y=3,res=1;
		while(y>0)
		{
			res=res*x;
			y--;
		}
		System.out.println("Value is :"+res);
	
	}

}
