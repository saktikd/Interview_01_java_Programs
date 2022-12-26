package revision_36_Programs;

public class P_036_wap_to_find_duplicate_letter_in_a_String {

	public static void main(String[] args) {

        String s = "bikerboyk";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					System.out.println(s.charAt(i));
			}
		}
	}

}
