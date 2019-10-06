package Package;
import java.util.*;

public class Testing {

	public static void main(String[] args) {
		ArrayList<String> first = new ArrayList<String>( 
	            Arrays.asList("Geeks", 
	                          "for", 
	                          "Geeks"));
		ArrayList<String> second = new ArrayList<String>( 
	            Arrays.asList("Geeks", 
	                          "Kareem", 
	                          "Hello"));
		Seet<String> set = new Seet<String>(first);
		Seet<String> set2 = new Seet<String>(second);
		Seet<String> ans = set.intersection(set2);
		ans.print();

	}

}
