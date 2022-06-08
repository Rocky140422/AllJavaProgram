package String;

public class Prog3StringMethods {

	public static void main(String[] args) {
		String name1="Pune";
		String name2="Pune";
		String name3="pune";
		
		String name4 = new String("Mumbai");
		String name5 = new String("Mumbai");
		
		//1)equals Method :this will compare string values
		System.out.println(name1.equals(name2)); //o/p true
		System.out.println(name4.equals(name5)); //o/p true
		System.out.println("Harry".equals("Harry")); //o/p true
		System.out.println(name1.equals("Pune")); //o/p true
		System.out.println(name1.equals(name3)); //o/p false
		
		//2)equalsIgnoreCase Method : ignore the case and only check characters are same or not
		
		System.out.println(name1.equalsIgnoreCase(name3)); //o/p true
		
		//3)length Method: measure the length of string value
		
		String str1="I Am An Engineer";
		int length = str1.length(); 
		System.out.println(length); //measures the characters o/p 16
		System.out.println(str1.length());//we can do direct also. o/p 16
		
		//4) toUpperCase Method:convert whole string value to uppercase
		System.out.println(str1.toUpperCase()); //o/p I AM AN ENGINEER
		
		//5) toLowerCase Method : convert whole string value to lowercase
		System.out.println(str1.toLowerCase()); //o/p i am an engineer
		
		//6)concat Method : it will join two string values 
		System.out.println(name1.concat(name4)); //o/p PuneMumbai
		
        String sentence ="India is a Developing Country. a b";
		
		//7) indexOf Method : it will check position of that string char/value
		System.out.println(sentence.indexOf('o')); //o/p 16
		System.out.println(sentence.indexOf('y')); //o/p 28
		
		//8) lastIndexOf method:If we are having more than two same chars, then by using this it help us to find the position of last char
		System.out.println(sentence.lastIndexOf('b')); //o/p 33
		
		//9) startsWith method : it will check that particular string is starting with entered value or not
		System.out.println(sentence.startsWith("India")); //o/p true
		
		//10) endsWith method : it will check that particular string is ends with entered value or not
		System.out.println(sentence.endsWith("b")); //o/p true
		
		//11)substring Method : it will print the string value from entered position in substring
		System.out.println(sentence.substring(4)); // o/p : a is a Developing Country. a b
		System.out.println(sentence.substring(4, 10)); //o/p : a is a
		
		//12)contains Method : it will check whether string is containing entered value or not
		System.out.println(sentence.contains("is")); // o/p : true
		
		//13) replace Method : it will replace new string value with old one 
		System.out.println(sentence.replace("India", "Bharat"));
	}

}
