package Package;
import java.util.*;
public class Seet<T> {
	private HashSet<T> hash_set = new HashSet<T>();
	private ArrayList<T> set;
	Seet(){
		set = new ArrayList<T>();
	}
	Seet(ArrayList<T> ini){
		for(int i = 0; i < ini.size(); i++) {
			if(hash_set.contains(ini.get(i))) {
				continue;
			}
			hash_set.add(ini.get(i));
			set.add(ini.get(i));
		}
	}
	public void add(T ob) {
		if(!hash_set.contains(ob)) {
			set.add(ob);
			hash_set.add(ob);
		}
	}
	public int getSize() {
		return set.size();
	}
	public T getIndex(int ind) {
		return set.get(ind);
	}
	public void print() {
		System.out.print("{");
		for(int i = 0; i < set.size(); i++) {
			System.out.print(set.get(i) + " ");
		}
		System.out.print("}");	
	}
	public boolean exist(T s) {
		return hash_set.contains(s);
	}
	public Seet<T> union(Seet<T> a){
		Seet<T> s = new Seet<T>();
		for(int i = 0; i < this.getSize(); i++) {
			s.add(this.getIndex(i));
		}
		for(int i = 0; i < a.getSize(); i++) {
			if(this.exist(a.getIndex(i))){
				continue;
			}
			s.add(a.getIndex(i));
		}
		return s;
	}
	public Seet<T> intersection(Seet<T> a){
		Seet<T> s = new Seet<T>();
		for(int i = 0; i < this.getSize(); i++) {
			if(a.exist(this.getIndex(i))) {
				s.add(this.getIndex(i));
			}
		}
		return s;
	}
	public Seet<T> complement(Seet<T> universe){
		Seet<T> s = new Seet<T>();
		for(int i = 0; i < universe.getSize(); i++) {
			if(!this.exist(universe.getIndex(i))) {
				s.add(universe.getIndex(i));
			}
		}
		return s;
		
	}
	
}
