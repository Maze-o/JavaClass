package CH08;

public class C05LocalVarMain {

	public static void main(String[] args) {

		C05Simple ss = new C05Simple();
		ss.Func1();

		ss.Func2();
	}
}

class C05Simple {

	int num = 5;

	void Func1() {
		System.out.println("num : " + num);
		int num = 10;
		System.out.println("Func1의 num : " + num);

	}

	void Func2() {
		System.out.println("Func2의 num : " + num);
		if (true) {
			int num = 20;
			System.out.println("Func2의 if안의 num : " + num);
		}
		System.out.println("Func2의 num : " + num);

		while (num < 10) {
			int num = 20;
			num++;
		}

	}

	void Func3(int num) {
		num++;
		this.num++;
	}

}
