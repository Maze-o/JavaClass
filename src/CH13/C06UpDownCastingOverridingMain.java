package CH13;

public class C06UpDownCastingOverridingMain {
	public static void main(String[] args) {
		Parent ob1 = new Parent();
		ob1.func1();

		Son ob2 = new Son();
		ob2.func1();

		Parent ob3 = new Son();
//		ob3.func2();
		ob3.func1();

		// Upcasting
		// 상위클래스형 참조변수 = 하위클래스형 객체
		// 자동형변환
		// Upcasting 상태에서는 확장된(추가된) 멤버변수, 멤버함수에 접근이 불가능함 (downcasting으로 해결)
		// Upcasting 상태에서는 재정의된 함수에 접근 가능하다

	}
}

class Parent {
	void func1() {
		System.out.println("Parent func() CALL");
	}

}

class Son extends Parent {
	void func1() {
		System.out.println("Son func1() CALL");
	}

	void func2() {
		System.out.println("Son func2() CALL");
	}

}
