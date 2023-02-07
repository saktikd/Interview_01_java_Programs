
package type1_Type_StarPattern;

public class Ex_7_pyramid {

	public static void main(String[] args) {
	
		int n=5,i,b,j;
		
		for(i=1;i<=n;i++)                        // for loop for n=5 (row number)
		{
			for(b=1;b<=n-i;b++)                  // for loop for space
				System.out.print(" ");   
			for(j=1;j<=(2*i)-1;j++)              // for loop for *
			    System.out.print("*");
			
			System.out.println();
			
		}
		
	}

}
