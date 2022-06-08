package Generalization;

public class Airtel implements MobileOperators{

	@Override
	public void audicalling() {
		System.out.println("5000 audio calls per month");
		
	}

	@Override
	public void dailyData() {
		System.out.println("1.5Gb daily data");
		
	}

	@Override
	public void messaging() {
		System.out.println("100 Daily Msg");
		
	}

}
