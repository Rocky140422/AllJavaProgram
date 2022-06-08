package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorCursorProgram {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		for(int i=1;i<6;i++)
		{
			al1.add(i);	
			
		}
		System.out.println(al1);
		System.out.println("****************");
		/*System.out.println("Elements of Arraylist by Iterator cursor");
		Iterator a = al1.iterator();
		while(a.hasNext())
			{
			 int num = (int) a.next();
			 if(num%2==0)
			 {
				 System.out.println(num);
			 }
			 else
			 {
				 a.remove();
			 }
			}*/
		System.out.println(al1);
		System.out.println("Elements of Arraylist by ListIterator cursor");
		ListIterator l = al1.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}

	}

}
