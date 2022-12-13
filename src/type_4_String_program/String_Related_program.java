package type_4_String_program;

public class String_Related_program {

	public static void main(String[] args) {
		
		
//1 .length() method to find number of string character
			
		String s = "sakti";
		System.out.println(s.length());     // 5
		
		
//2 .trim() method to trim the white spaces both left and right side
		
		String s1 = "   sakti  ";
		System.out.println(s1.trim());     //sakti
		
		
//3 .isEmpty() method to check string value is empty or not
		
		String s2 = "";
		System.out.println(s2.isEmpty());     // true
		
//4 .equals() method to verify two string value same or not
		
		String s3 = "Ram";
		String s4 = "ram";
		System.out.println(s3.equals(s4));     //false
		
//5 .equalsIgnoreCase() method to check two string value and ignoring case
		
		System.out.println(s3.equalsIgnoreCase(s4));     // true
		
//6 String Concatenate '+' operator , concat() method
		
		String s5 = "ram";
		String s6 = " sita";
		int i1 = 10;
		int i2 = 20;
		
		System.out.println(s5+s6);           // ram sita
		System.out.println(s5.concat(s6));
		
		System.out.println(s5+s6+i1+i2);     // ram sita1020
		
		System.out.println(i1+i2+s5+s6);     // 30ram sita
		
		System.out.println(i1+s5+i2+s6);     // 10ram20 sita
		
		
//7 .toUpperCase() & toLowerCase()
		
		System.out.println(s5.toUpperCase());     // RAM
		System.out.println(s5.toLowerCase());     // ram
		
		
//8 .charAt() method to find specific index position of a given string
		
		String s7 = "elephant";
		System.out.println(s7.charAt(2));     //e
		
		
//9 .contains() method Checks whether a string contains a sequence of characters. Return type is boolean
		
		String s8 = "elephant";
		String s9 = "phant";
		
		System.out.println(s8.contains(s9));     // true
		
	
//10 .contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
		
		String p1 = "elephant";
		String p2 = "elephant";
		
		System.out.println(p1.contentEquals(p2));     // true
		
		
//11 .indexOf() 	Returns the position of the first found occurrence of specified characters in a string
		
		String p3 = "elephant";
		System.out.println(p3.indexOf("l"));     // 1
		
		
//12 .replace() Searches a string for a specified value, and returns a new string where the specified values are replaced
		
		String p4 = "bhubaneswar";
		System.out.println(p4.replace("bhuban", "bal"));     // baleswar
		
		String p5 = "cuttcuack";
		System.out.println(p5.replaceFirst("cu", "ku"));     // kuttcuack
		
		
//13 .substring() this method is used to extract a sub portion of string from main string		
		
		System.out.println(p4.substring(2, 5));     // uba
		
		System.out.println(p4.subSequence(2, 5));   // uba
		
		System.out.println(p4.substring(1));        // hubaneswar
		
		
//14 .compareTo() method compare ASCII value of character and subtract and return int value
		
		String k1 = "a";
		String k2 = "A";
		System.out.println(k1.compareTo(k2));    // 32
		
//15 .compareToIgnoreCase()
		
		String k3 = "a";
		String k4 = "A";
		System.out.println(k3.compareToIgnoreCase(k4));    // 0
		
		
//16 .join() used to add any value between two string using String class		
		
		String l1 = "rajesh";
		String l2 = "bikash";
		
		System.out.println(String.join(" & ", l1,l2));     // rajesh & bikash

		 
//17 .valueOf() method used to convert any data type into String 
		
		int a = 10;
		String x = String.valueOf(a);
		System.out.println(x);        // Return 10 is a String value
		
		
//18 .toCharArray() method used to convert any string into character array		
		
		char[] c = x.toCharArray();
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
