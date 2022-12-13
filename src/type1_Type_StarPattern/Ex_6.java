package type1_Type_StarPattern;

public class Ex_6 {

	static int r,c,n=6;
	public static void main(String[] args) {
		
		for (r=0; r<=2*n; r++)
		{
			int totalColInRow = r > n ? 2 * n - r : r;
			for (c=0; c<totalColInRow; c++)
			{
				System.out.print( "* " );
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
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 



















*/