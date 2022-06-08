package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListProg {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		
		System.out.println(al1.size());
		System.out.println(al1.isEmpty());
		ArrayList al2 = new ArrayList(1000);
		System.out.println(al1.isEmpty());
		
		ArrayList al3 = new ArrayList(al2);
	
		System.out.println(al1.equals(al3));
		
		al1.add(10);
		System.out.println(al1);
		al1.add("Vishwas");
		System.out.println(al1);
	//	al1.remove(0);
	//	System.out.println(al1);
		al1.add(0, "Mahajan");
		System.out.println(al1);
		System.out.println(al1.contains("Mahajan"));
		System.out.println(al1.indexOf("Mahajan"));
		System.out.println(al1.equals(al3));
		System.out.println(al1.size());
		
		
		
	}

}
