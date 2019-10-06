package Package;
import java.util.*;
// hello
public class Seet {
	private Set<String> hash_set = new HashSet<String>();
	private ArrayList<String> set;
	Seet(ArrayList<String> initial){
		set = initial;
		for(int i = 0; i < set.size(); i++) {
			hash_set.add(set.get(i));
		}
	}
	public void print() {
		System.out.print("{");
		for(int i = 0; i < set.size(); i++) {
			System.out.print(set.get(i) + " ");
		}
		System.out.print("}");	
	}
	public boolean exist(String s) {
		return hash_set.contains(s);
	}
}
