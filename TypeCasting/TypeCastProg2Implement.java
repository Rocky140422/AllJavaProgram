package TypeCasting;

public class TypeCastProg2Implement {

	public static void main(String[] args) {
		// Up Casting example
		TypeCastProg2P a = new TypeCastProg2C();
		a.show();
		System.out.println("*********************");
		// Down Casting example
		TypeCastProg2C b = (TypeCastProg2C) new TypeCastProg2P();
		b.show();
		b.show1();

	}

}
