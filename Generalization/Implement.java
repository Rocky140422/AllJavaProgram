package Generalization;

public class Implement {

	public static void main(String[] args) {
		Airtel x = new Airtel();
		x.audicalling();
		x.dailyData();
		x.messaging();
		System.out.println("***************");
		
		Jio y = new Jio();
		y.audicalling();
		y.dailyData();
		y.messaging();
		System.out.println("****************");
		
		Vi z = new Vi();
		z.audicalling();
		z.dailyData();
		z.messaging();

	}

}
