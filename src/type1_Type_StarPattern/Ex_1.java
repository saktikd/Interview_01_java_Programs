package type1_Type_StarPattern;

public class Ex_1 {

	static int r,c,n=5;
	public static void main(String[] args) {
		
		for (r=1; r<=n; r++)
		{
			for (c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
			
	}
}


/*
output


* 
* * 
* * * 
* * * * 
* * * * * 





*/