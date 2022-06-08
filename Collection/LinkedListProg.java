package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListProg {

	public static void main(String[] args) {

		LinkedList ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList(ll1);

		ll1.size();
		System.out.println(ll1);
		ll1.add("Vishwas");
		ll1.add(0,"Mahajan" );
		ll1.addFirst("Mrs");
		ll1.addLast("is");
		System.out.println(ll1.contains("Vishwas"));
		System.out.println(ll1.isEmpty());
		System.out.println(ll1);
		System.out.println(ll1.getFirst());
		System.out.println(ll1.getLast());
		System.out.println(ll1.indexOf("is"));
		System.out.println(ll1.add("Mrs"));
		System.out.println(ll1);
		System.out.println(ll1.lastIndexOf("Mrs"));
		System.out.println(ll1.pollFirst());
		System.out.println(ll1);
		System.out.println(ll1.pollLast());
		System.out.println(ll1);
		ll1.remove("is");
		System.out.println(ll1);
		Collections.reverse(ll1);
		System.out.println(ll1);
		
		

		
	}

}
