package CH12;

public class Logic {
	public static void main(String[] args) {
		Buy 사람1 = new Buy(15000, 0);
		Buy 사람2 = new Buy(20000, 0);
		
		Sel GS감삼편의점  = new Sel(1500, 100, 100000);
		
		사람1.pay(GS감삼편의점, 15000);
		
		System.out.println(사람1);
		System.out.println(GS감삼편의점);
		
	}
}
