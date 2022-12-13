package type_4_String_program;

public class StringBuffer_and_StringBuilder {

	public static void main(String[] args) {
		
		
		
		// StringBuffer and StringBuilder class constructors and methods are same. The only difference is :
		// in StringBuffer methods are Synchronized but in StringBuilder methods are not Synchronized hence faster in performance.
		
		
		
		
// .append() method used for addition of two String (Here concat() not present in StringBuffer class)
		
		StringBuffer sb = new StringBuffer("elephant");
		
		System.out.println(sb.append(" & ant"));     // elephant & ant

		
// .capacity() method used to know how many character a string can store. default capacity is '16'. 
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());          // 16 ( default value)
		
		StringBuffer sb2 = new StringBuffer("rama");
		System.out.println(sb2.capacity());          // 20 ( 16+4 )
		
		StringBuffer sb3 = new StringBuffer(100);
		System.out.println(sb3.capacity());  // 100 ( it can fix the size if you already know how many character you need to store in that string)
		
		
// .delete() method used to delete character & it need two parameter.starting position and end position (Delete Starting position to end int-1)
		
		StringBuffer sb4 = new StringBuffer("ramarao");
		System.out.println(sb4.delete(1, 4));           // rrao   (1 to 4-1 deleted)
		
// .deleteCharAt() used to delete particular index position
		
		StringBuffer sb5 = new StringBuffer("ramarao");
		System.out.println(sb5.deleteCharAt(0));        // amarao
		
		
// .insert() method used to insert any data in a string
		
		StringBuffer sb6 = new StringBuffer("ramarao");
		System.out.println(sb6.insert(3, " k "));           // ram k arao
		
		
// .replace() used to replace some part of string data
		
		StringBuffer sb7 = new StringBuffer("ramarao");
		System.out.println(sb7.replace(0, 4, "k."));    // k.rao

// .setCharAt() used to replace particular character by giving index number
		
		StringBuffer sb8 = new StringBuffer("ramarao");
        sb8.setCharAt(0, 'k');
		System.out.println(sb8);                     // kamarao
		
		
// .reverse() used to reverse a string
		
		StringBuffer v = new StringBuffer("java");
		System.out.println(v.reverse());             // avaj
		
		
		
		
		
		
		
		
	}

}
