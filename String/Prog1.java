package String;

public class Prog1 {

	public static void main(String[] args) {
		String str1="Andy";
		String str2="Andy"; //here value is same so same memory will be acquired by both the String Objects		
//	String str1="Terminator"; //error,when we try to change to change the object, because string objects are immutable(can't be changed)
		System.out.println(str1);
		
		String str3 = new String("Harry");
		String str4 = new String("Potter");
	//	String str3="Merry";  // Even here when we try to change the objects it will not happen ,cause, String Objects are immutable
		
		str1.concat("Murray");
		str1=str1.concat(" Murray"); //concat is String Method
		
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		

	}

}
