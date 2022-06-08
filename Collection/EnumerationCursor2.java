package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationCursor2 {

	public static void main(String[] args) {

		Vector v = new Vector();
		Vector v1 =  new Vector();
		for(int i=0;i<=10;i++){
			v.add(i);}
		//System.out.println(v);
	/*	Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	/*	v1.add("chaitanya");
		v1.add("bhagyashree");
		v1.add("gaurav");
		v1.add("vishwas");
		v1.add("ashwini");
		System.out.println(v1);

	/*	System.out.println("Vector elements by Enumeration Cursor");
		Enumeration e1= v1.elements();
		while(e1.hasMoreElements()){
			System.out.println(e1.nextElement());
			
		System.out.println("************");	
		System.out.println("Vector elements by Iterator Cursor");
		Iterator itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("************");	*/
	/*	System.out.println("Vector elements by List Iterator Cursor");
		ListIterator li = v1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}*/
		ListIterator li1 = v.listIterator();
		while(li1.hasNext()){
			int ele=(int) li1.next();
			if(ele==5)
			{
				li1.remove();
			}
			else if(ele==2)
			{
				li1.add(22);
			}
			else if (ele==3)
			{
				li1.set(33);
			}}
			System.out.println(v);
	}
		
}
		
		
	


