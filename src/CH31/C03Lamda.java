package CH31;

public class C03Lamda {
	public static void main(String[] args) {

		Calculator add = (a, b) -> {
			return a + b;
		};

		Calculator sub = (a, b) -> {
			return a - b;
		};

		Calculator mul = (a, b) -> {
			return a * b;
		};

		Calculator div = (a, b) -> {
			return a / b;
		};
		
		int msg = add.calculate(10, 20); // 덧셈
		int msg2 = sub.calculate(10, 20); // 뺄셈
		int msg3 =  mul.calculate(10, 20); // 곱셈
		int msg4 = div.calculate(10, 20); // 나눗셈
		
		System.out.println(msg);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		

	}
}

interface Calculator {

	int calculate(int num1, int num2);
	
}
