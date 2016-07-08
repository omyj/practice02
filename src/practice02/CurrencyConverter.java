package practice02;

public class CurrencyConverter {
	private static double rate = 0.;

	public static double toDollar(double won) {
		won = won/rate;
		return won;
		// 한국 원화를 달러로 변환
	}

	public static double toKWR(double dollar) {
		dollar = dollar*rate;
		return dollar;
		// 달러를 한국 원화로 변환
	}

	public static void setRate(double r) {
		rate = r;
		// 환율 설정(KWR/$1)
	}

	public static void main(String[] args) {
		setRate(1208.50);
		System.out.println("백만원은 " + toDollar(1000000) + "달러 입니다.");
		System.out.println("백달러는 " + toKWR(100) + "원 입니다.");
	}
}
