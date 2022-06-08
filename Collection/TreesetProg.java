package Collection;

import java.util.TreeSet;

public class TreesetProg {

	public static void main(String[] args) {

		TreeSet ts1 = new TreeSet();
		TreeSet ts2 = new TreeSet(ts1);
		 
		ts1.add(0);
		ts1.add(5);
		ts1.add(3);
		ts1.add(2);
		for(int i=6;i<10;i++)
		{
			ts1.add(i);
		}
		System.out.println(ts1);
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		ts1.pollFirst();
		System.out.println(ts1);
		ts1.pollLast();
		System.out.println(ts1);
		ts1.remove(3);
		System.out.println(ts1);
		ts1.clear();
		System.out.println(ts1);
		
		
	//	ts1.add("Vishwas");
	//	ts1.add(null); (not heterogeneous)
	//	System.out.println(ts1);
		
		ts2.add("ron");
		ts2.add("jack");
		ts2.add("harry");
		//ts2.add(null);
		
	//	System.out.println(ts2);
		
		
		
	}

}
