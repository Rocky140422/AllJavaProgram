package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProg2 {

	public static void main(String[] args) {
		ArrayList al1 = new  ArrayList();
		
		ArrayList al2 = new ArrayList();
		
		ArrayList al3 = new ArrayList(100);
		
		al1.add("Vishwas");
		al1.add("Mahajan");
		al1.add(101);
		al1.add("Jalna");
		al1.add(2, "QA");
		al1.add("SeleniumMaster");
		System.out.println(al1);
		al1.set(3, 143);
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		System.out.println(al1.contains("QA"));
		System.out.println(al1.equals(al3));
		System.out.println(al1.get(0));
		System.out.println(al1.indexOf("Jalna"));
		al1.add("QA");
		System.out.println(al1.size());
		System.out.println(al1.lastIndexOf("QA"));
		al2.add(100);
		System.out.println(al2);
		al2.add(al1);
		
		System.out.println(al2.size());
		System.out.println(al2.containsAll(al1));
		
		/*al2.add(" ");
		System.out.println(al2);
		System.out.println(al1.containsAll(al2));*/
		Collections.reverse(al1);
		System.out.println(al1);
		al3.add(1);
		al3.add(5);
		al3.add(2);
		al3.add(9);
		al3.add(4);
		System.out.println(al3);
		Collections.reverse(al3);
		System.out.println(al3);
		Collections.sort(al3);
		System.out.println(al3);
		
	}

}
