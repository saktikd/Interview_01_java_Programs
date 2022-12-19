package revision_36_Programs;

import java.util.Scanner;

public class P_002_wap_to_check_String_is_Palindrome_or_not {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		
		System.out.println("Original String is "+s);
		
		String r = "";
		
		for (int i=0;i<s.length();i++)
		{
			r=s.charAt(i)+r;
		}
		
		System.out.println("Reverse String is "+r);
		
		System.out.println();
		
		if(s.equals(r))
		{
			System.out.println("String is Palindrome");
		}else
		{
			System.out.println("String is not Palindrome");
		}
		
		
	}

}
