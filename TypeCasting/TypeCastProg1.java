package TypeCasting;

public class TypeCastProg1 {

	public static void main(String[] args) {
		// This is Implicit casting
				int a = 10;
				double b = a;
				System.out.println("Int value = " + a);
				System.out.println("Double Value = " + b);
				System.out.println("************************");
				// This is explicit casting
				double c = 20.25;
				int d = (int) c;
				System.out.println("Double value = " + c);
				System.out.println("Int Value = " + d);
				// Here we are loosing the data
				float e = (float) c;
				System.out.println("Float value = " + e );

	}

}
