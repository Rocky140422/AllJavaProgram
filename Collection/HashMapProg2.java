package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapProg2 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		HashMap hm1 = new HashMap(100);
		HashMap hm2 = new HashMap(100,10);
		HashMap hm3 = new HashMap(hm);
		 hm.put(2, "Ganesh");
		 hm.put(1, "Vishwas");
		 hm.put(4, "Vaibhav");
		 hm.put(3,"sachin");
		 System.out.println(hm);
		 hm.put(2, "Gavali");
		 System.out.println(hm);
		 hm.put('A', 1111);
		 hm.put('B', 5555);
		 hm.put('D', 8888);
		 hm.put('C', 4444);
		 System.out.println(hm);
		 System.out.println(hm.containsKey(1));
		 System.out.println(hm.get(2));
		 System.out.println(hm.isEmpty());
		 hm.putIfAbsent(5, "Soma");
		 System.out.println(hm);
		 hm.remove(3);
		 System.out.println(hm);
		 System.out.println(hm.entrySet());
		 System.out.println(hm.keySet());
		 System.out.println(hm.values());
		 System.out.println(hm.size());
		 Set s = hm.entrySet();
		 Iterator it = s.iterator();
		/* while(it.hasNext()){
			 System.out.println(it.next());
		 }*/
		 
		 for(;it.hasNext();){
			 System.out.println(it.next());
		 }
	}
	

}
