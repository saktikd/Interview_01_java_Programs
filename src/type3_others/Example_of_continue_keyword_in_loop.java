package type3_others;

public class Example_of_continue_keyword_in_loop {

	public static void main(String[] args) {
		
		
		int i=0;
		while(i<=10)
		{
			i=i+1;
			
			if(i==5)
				continue;
			System.out.println(i);
		}
		System.out.println("Execution done");
	}
	
}
