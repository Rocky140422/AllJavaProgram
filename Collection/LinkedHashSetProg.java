package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetProg {

	public static void main(String[] args) {

		LinkedHashSet lhs1 = new LinkedHashSet();
		LinkedHashSet lhs2 = new LinkedHashSet(lhs1);
		LinkedHashSet lhs3 = new LinkedHashSet(100);
		
		lhs1.add(101);
		lhs1.add("Vishwas");
		lhs1.add("mahajan");
		lhs1.add("Vishwas");
		lhs1.add(null);
		lhs1.add("QA");
		System.out.println(lhs1);
		System.out.println(lhs1.size());
		System.out.println(lhs1.contains("QA"));
		System.out.println(lhs1.isEmpty());
		lhs1.remove(101);
		System.out.println(lhs1);
	}

}
