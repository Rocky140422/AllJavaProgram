package String;

public class StringPractise {

	public static void main(String[] args) {
		String s = new String("Vishwas");
		String s1 = new String("Vishwas");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		String a = "Vishwas";
		String a1 = "Vishwas";
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		if(s==s1){
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
