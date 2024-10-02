package CH14;

public class C01AbstractMain {
	public static void main(String[] args) {
		// 일반클래스 상속관계 확인
		Super1 ob1 = new Super1();
		Sub1 ob2 = new Sub1();
		
		ob1.Func();
		ob2.Func();
		
//		Super2 ob4 = new Super2();
		Sub2 ob5 =  new Sub2();
		Super2 ob6 = ob5;
		ob6.Func();
		
		
		
		
		
		
		
		

	}
}

//일반클래스 상속관계
class Super1 {
	void Func() {

	}
}

class Sub1 extends Super1 {
	void Func() {
		System.out.println("Son1's Function..");
	}
}

//추상클래스 상속관계
abstract class Super2 {
	abstract void Func();
}

class Sub2 extends Super2 {
	void Func() {
		System.out.println("Son2's Function..");
	}

}
