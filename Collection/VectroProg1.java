package Collection;

import java.util.Collections;
import java.util.Vector;

public class VectroProg1 {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		Vector v2 = new Vector(v1);
		Vector v3 = new Vector(20,5); // default capacity 20, it will increse by 5
		Vector v4 = new Vector(1000); // default capacity 100
		//System.out.println(v1.size());
		//System.out.println(v2.size());
		//System.out.println(v3.size());
		//System.out.println(v4.size());
		System.out.println(v1.capacity());
		//System.out.println(v2.capacity());
		System.out.println(v3.capacity());
		//System.out.println(v4.capacity());
		
		
		for(int i=0;i<5;i++)
		v1.add(i);
		System.out.println("V1 = " + v1);
		System.out.println("Capacity of v1 = " + v1.capacity());
		v1.add(0);
		System.out.println("V1 = " + v1);
		System.out.println(v1.size());
		v1.add(2, "Vishwas");
		System.out.println(v1);
		v1.addAll(v2);
		System.out.println(v1.size());
		System.out.println(v1.containsAll(v2));
		v2.add(20);
		v2.add(21);
		v1.addAll(v2);
		v1.addElement('+');
		System.out.println(v1);
		System.out.println(v1.size());
		v2.clear();
		System.out.println(v2);
		v1.clone();
		System.out.println(v1);
		System.out.println(v1.elementAt(5));
		System.out.println(v1.lastElement());
		System.out.println(v1.lastIndexOf(20,7));// it is printing last index of 20 from all 7 index positions 
		v1.insertElementAt("Mahajan",3 );
		System.out.println(v1);
		System.out.println(v1.firstElement());
		v1.set(2, "Vishu");
		System.out.println(v1);
		
		Collections.reverse(v1);
		System.out.println(v1);
		
		
		
		
	}

}
