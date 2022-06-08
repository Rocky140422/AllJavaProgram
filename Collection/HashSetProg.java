package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetProg {

	public static void main(String[] args) {

		HashSet hs1 = new HashSet();
		HashSet hs2 = new HashSet(hs1);
		HashSet hs3 = new HashSet(10);
		HashSet hs4 = new HashSet(10,9);
		
		hs1.add("B");
		hs1.add("Manual");
		hs1.add("C");
		hs1.add("A");
		hs1.add("A");
		hs1.add("null");
		hs1.add("E");
		hs1.add("a");
		hs1.add(100);
		System.out.println(hs1);
		System.out.println(hs1.isEmpty());
		System.out.println(hs1.size());
		//hs1.clear();
		System.out.println(hs1);
		
		
	}

}
