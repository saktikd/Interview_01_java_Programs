package practices;
public class A_Practice_Demo {

	public static void main(String[] args) {
		
	
		String str = "ggittttaaa";
		System.out.println("Original string is :"+str);
		
		StringBuffer s = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int index = str.indexOf(ch, i+1);
			if(index==-1)
			{
				s.append(ch);
			}
		}
		System.out.println("String without duplicate is : "+s);
		
		
		
		
		
   }
	
}