package CH17;

public class C05ThrowAndThrowsMain {
	public static void main(String[] args) {
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		A a = new A();
		B b = new B();
		try {
			b.Ex2(a);
		} catch (Exception e) {
			System.out.println("Main에서 예외처리");
		}
		System.out.println("실행코드 3");

	}
}

class A {
	public void Ex1() {
		throw new NullPointerException("NullPointException");
	}
}

class B {
	public void Ex2(A a) {
		try {
			a.Ex1();
		} catch (NullPointerException e) {
			System.out.println("EX2에서 예외처리");
		}
	}
}
