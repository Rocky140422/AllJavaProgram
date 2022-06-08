package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursorProgram {
	
	public static void main(String[] args) {
				Vector v = new Vector();
				for(int i=1;i<10;i++)
				{
					v.add(i);
				}
				System.out.println(v);
				System.out.println("elements in vector");
				Enumeration e = v.elements();
				while(e.hasMoreElements())
				{
					System.out.println(e.nextElement());
				}
				
				Vector v1 = new Vector();
				v1.add("A");
				v1.add("B");
				v1.add("C");
				v1.add("F");
				v1.add("D");
				System.out.println("**************");
				Enumeration r = v1.elements();
				while(r.hasMoreElements())
				{
					System.out.println(r.nextElement());
				}
				
				
			}

		

	}


