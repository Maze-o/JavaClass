package CH33;

import java.util.Arrays;

public class C02Ex {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("합 : " + calc.sum.execute(10, 20, 30));
		System.out.println("차 : " + calc.sub.execute(1, 2, 3, 4, 20));
		System.out.println("곱 : " + calc.mul.execute(20, 40));
		System.out.println("나 : " + calc.div.execute(40, 20));

	}
}

class Calc {
	functional sum = (el) -> {
		return Arrays.stream(el).reduce(0, (a, b) -> a + b);
	};
	
	functional sub = (el) -> {
		return Arrays.stream(el).boxed().sorted((a, b) -> b - a).reduce(0, (a, b) -> b - a);
	};
	
	functional mul = (el -> {
		return Arrays.stream(el).reduce(1, (a, b) -> a * b);
	});
	
	functional div = (el -> {
		return Arrays.stream(el).reduce((a, b) -> a / b).orElse(0);
	});

	Calc() {

	}
}

@FunctionalInterface
interface functional {
	int execute(int... args);
}