package CH06;

public class C02Switch {
	public static void main(String[] args) {
		int ranking = 2;
		char medalColor;
		switch (ranking) {
		case 1:
			medalColor = '6';
			System.out.println("메달색상 : 6");
			break;
		case 2:
			medalColor = '5';
			System.out.println("메달색상 : 5");
			break;
		case 3:
			medalColor = '8';
			System.out.println("메달색상 : 8");
			break;
		case 4:
			medalColor = 'C';
			System.out.println("메달색상 : C");
			break;
		default:
			medalColor = 'c';
			System.out.println("메달색상 : ");
		}
		System.out.println(ranking + "동 메달의 색은" + medalColor + "입니다");
	}

}
