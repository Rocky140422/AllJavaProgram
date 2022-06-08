package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {

		HashMap	hm1	=	new	HashMap();	 //	empty	hash	map	object	with	default	initial	
		//capacity	=	16	load	factor	=	0.75
		HashMap	hm2	=	new	HashMap(1000);
		HashMap	hm3	=	new	HashMap(1000,90);
		HashMap	hm4	=	new	HashMap(hm1); //	can	take	map	object	as	parameter
		hm1.put(4,	"Tesla");
		hm1.put(1,	"Velocity");
		hm1.put(2,	"Google");
		hm1.put(3,	"Facebook");
		System.out.println(hm1);
		hm1.put(2,	"Alphabet");
		System.out.println(hm1);
		hm2.put('B',	111);
		hm2.put("A",	222);
		hm2.put("D",333);
		hm2.put("C",444);
		System.out.println(hm2);
		System.out.println(hm2.keySet());
		System.out.println(hm2.values());
		System.out.println(hm2.entrySet());
		Set	s1	=	hm1.entrySet();
		Iterator	itr	=	s1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		
		
		
	}}
