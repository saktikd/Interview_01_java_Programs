package revision_36_Programs;

import java.util.Scanner;

public class P_001_wap_to_Reverse_a_String {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		
		System.out.println("Oroginal String is "+s);
		
		String r="";
		
		for(int i=0;i<s.length();i++)
		{
			r=s.charAt(i)+r;
		}
		
		System.out.println("Reverse String is :"+r);
		
		
		
	}

}
