package CH33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {

		Func1 func1 = (msg) -> {
			System.out.println(msg);
		};

		func1.say("HELLO WORLD");

		Func1 func1_1 = System.out::println;
		func1_1.say("HELLOWORLD2");

		Func2 func2 = (arg) -> {
			int sum = 0;
			for (int el : arg) {
				sum += el;
			}
			return sum;
		};

		int sum = func2.sum(30, 40, 55, 60);
		System.out.println(sum);

		Func2 func2_2 = (arg) -> {
			return Arrays.stream(arg).reduce(0, (a, b) -> a + b);
		};

		System.out.println(func2_2.sum(1, 2, 3, 4, 5, 6, 7, 8, 10, 210312));

		Func3 func3 = (arg) -> {
			return Arrays.stream(arg).boxed().sorted((a, b) -> b - a).collect(Collectors.toList());
		};

		List<Integer> li = func3.createListDesc(6, 44, 32423, 423, 4, 234, 234, 3, 4);
		
		System.out.println(li);

	}

}

@FunctionalInterface // 함수형 인터페이스로 인식해주게 하는 어노테이션
interface Func1 {
	void say(String message); // 함수형 인터페이스를 만들 때는 메서드를 하나만 넣는것이 원칙이다.

}

@FunctionalInterface
interface Func2 {
	int sum(Integer... args);
}

@FunctionalInterface
interface Func3 {
	List<Integer> createListDesc(int... args);
}
