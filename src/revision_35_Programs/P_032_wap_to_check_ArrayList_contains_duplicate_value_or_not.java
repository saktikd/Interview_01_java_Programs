package revision_35_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class P_032_wap_to_check_ArrayList_contains_duplicate_value_or_not {

	public static void main(String[] args) {

		
		ArrayList<Object> al = new ArrayList<>();       // by passing Object as an parameter any data type can stored in ArrayList
		
		al.add(32);
		al.add("ram");
		al.add(true);
		al.add(54.325);
		al.add("ram");
		al.add(58);

		System.out.println("Size of ArrayList is "+al.size());
		
		Set<Object> set = new HashSet<>(al);         // Converting ArrayList to HashSet to eliminate duplicate value
		
		System.out.println("Size of HashSet is "+set.size());
		
		if(al.size()!=set.size())
		{
			System.out.println("ArrayList have Duplicate values");
		}else
		{
			System.out.println("ArrayList does not have duplicate values");
		}
		
		
		
	}

}
