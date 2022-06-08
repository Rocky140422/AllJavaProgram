package String;

public class Prog2 {

	public static void main(String[] args) {
		String str1="Harry";
		String str2="Harry";
		String str3="Harry";
		
		String str4 = new String("Potter");
		String str5 = new String("Potter");
		
		System.out.println(str1); //O/P Harry
		str1.concat("Potter");  //Proving String is immutable
		System.out.println(str1.concat("potter")); // O/P Harry
		str3=str3.concat(" Potter"); //Trying to assign variable
		System.out.println(str3);//o/p Harry Potter

		int a=10,b=10;
		System.out.println(a==b); //Comparing	int	values ,o/p true*/
		
		System.out.println(str1==str2); //Comparing the address of String objects created without new keyword values,o/p tru.*/e
		System.out.println(str3==str4); //Comparing the address of String objects created with new keyword values,o/p false*/
		System.out.println(str4==str5); //Comparing the address of String objects created with new keyword values,o/p false*/
	}

}
