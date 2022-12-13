package type_4_String_program;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		
		    String originalStr = "java";
		    String reversedStr = "";
		    System.out.println("Original string: " + originalStr);
		        
		    for (int i = 0; i < originalStr.length(); i++) {
	        reversedStr = originalStr.charAt(i) + reversedStr;

		    }
		    
		    System.out.println("Reversed string: "+ reversedStr);
	
		    
	System.out.println();    // Or ( Another way )
	
	
	        String orgnlStr = "java";
		    String rvrsStr = "";
		    System.out.println("Original string: " + orgnlStr);
		    
		    for(int i=orgnlStr.length()-1;i>=0;i--)
		    {
		    	rvrsStr = rvrsStr + orgnlStr.charAt(i);
		    }
		    System.out.println("Reversed string: "+ rvrsStr);
		   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
		
	        }
	         
	        

}
