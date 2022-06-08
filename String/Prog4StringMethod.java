package String;

public class Prog4StringMethod {

	public static void main(String[] args) {
		String sentence ="India is a Developing Country. a b";
		
		//7) indexOf Method : it will check position of that string char/value
		System.out.println(sentence.indexOf('o')); //o/p 4
		System.out.println(sentence.indexOf('y')); //o/p 28
		
		//8) lastIndexOf method:If we are having more than two same chars, then by using this it help us to find the position of last char
		System.out.println(sentence.lastIndexOf('b')); //o/p 31
		
		//9) startsWith method : it will check that particular string is starting with entered value or not
		System.out.println(sentence.startsWith("is")); //o/p true
		
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
