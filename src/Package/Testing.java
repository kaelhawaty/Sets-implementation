package Package;
import java.util.*;

public class Testing {

	public static void main(String[] args) {
		System.out.println("Hello, this program can do operatons at sets");
		System.out.println("Please Enter the size of Universe set");
		Scanner scan = new Scanner(System.in);
		int sz = scan.nextInt();
		System.out.println("Please Enter the Universe set");
		ArrayList<String> l = new ArrayList<String>();
		for (int i = 0; i < sz; ++i) {
			String t = scan.next();
			l.add(t);
		}
		Seet<String> universe = new Seet<String>(l);
		System.out.println("Enter the size of first set");
		sz = scan.nextInt();
		System.out.println("Enter the first set");
		l.clear();
		for (int i = 0; i < sz; ++i) {
			String t = scan.next();
			l.add(t);
		}
		Seet<String> set1 = new Seet<String>(l);
		System.out.println("Enter the size of second set");
		sz = scan.nextInt();
		System.out.println("Enter the second set");
		l.clear();
		for (int i = 0; i < sz; ++i) {
			String t = scan.next();
			l.add(t);
		}
		Seet<String> set2 = new Seet<String>(l);
		boolean flag = true;
		while (flag) {
			System.out.println("What do u want to do?");
			System.out.println("Enter 1 to union two sets");
			System.out.println("Enter 1 to intersect two set");
			System.out.println("Enter 3 to get the complement of a set");
			System.out.println("Enter 4 to close the program");
			int option = scan.nextInt();
			switch(option) {
			case 1:
				Seet<String> union = set1.union(set2);
				union.print();
				break;
			case 2:
				Seet<String> intersect = set1.intersection(set2);
				intersect.print();
				break;
			case 3:
				System.out.println("Choose which set do u want to get its complement 1 or 2");
				sz = scan.nextInt();
				Seet<String> complement = new Seet<String>();
				if (sz == 1) {
					complement = set1.complement(universe);
					complement.print();
				}
				else if (sz == 2) {
					complement = set2.complement(universe);
					complement.print();
				}
				else
					System.out.println("ERROR");
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("ERROR enter a valid number from 1 to 4");
			}
		}

	}

}
