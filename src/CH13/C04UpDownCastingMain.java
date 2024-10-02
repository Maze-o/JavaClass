package CH13;

public class C04UpDownCastingMain {
	public static void main(String[] args) {
		// Nocasting
		Super ob1 = new Super();
		ob1.n1 = 100;

		Sub ob2 = new Sub();
		ob2.n1 = 100;
		ob2.n2 = 200;

		// UpCasting (상위클래스형 참조변수 = 하위클래스형 객체), 자동형변환
		Super ob3 = new Sub(); // 보이지 않지만 앞에 (Super)가 붙어있음
		ob3.n1 = 100;
//		ob3.n2 = 100;

		Super ob4 = ob2;
		ob4.n1 = 400;

		// DownCasting(하위클래스형 참조변수 = 상위클래스형 객체) , 강제형변환
//		Sub ob5 = (Sub) new Super();

		Sub down = (Sub) ob3;
		down.n1 = 10;
		down.n2 = 100;
		
		System.out.println(down.n1);
		System.out.println(down.n2);
		

	}
}

class Super {
	int n1;
}

class Sub extends Super {
	int n2;
}
