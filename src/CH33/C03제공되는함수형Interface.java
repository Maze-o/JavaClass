package CH33;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C03제공되는함수형Interface {

	public static Function<Integer, Integer> func1 = x -> x * x;
	public static Function<Integer, Integer> func1_2 = x -> x + x;
	public static Function<List<Integer>, Integer> func1_3 = x -> x.stream().reduce((a, b) -> a + b).get();
	public static Function<List<Object>, List<Integer>> func1_4 = x -> {
		return x.stream().filter(el -> {
			return el instanceof Integer;
		}).map(el -> (Integer) el).collect(Collectors.toList());
	};

	// 2
	public static Function<Integer, Integer> func2 = func1.andThen(func1_2);
	public static Function<Integer, Integer> func2_2 = func1_2.andThen(func1);

	// 3
	public static BinaryOperator<Integer> func3 = (x, y) -> {
		return x + y;
	};

	// 4
	public static Function<Integer, Function<Integer, Integer>> func4 = x -> y -> x + y;

	public static void main(String[] args) {

		System.out.println(func1.apply(5));
		System.out.println(func1_2.apply(5));
		List<Integer> dd = new ArrayList<>();
		dd.add(22);
		dd.add(21);
		System.out.println(func1_3.apply(dd));

		List<Object> li1 = new ArrayList();
		li1.add("홍길동");
		li1.add(10);
		li1.add(11);
		li1.add(12);
		List<Integer> li2 = func1_4.apply(li1);
		System.out.println("li2 : " + li2);

		System.out.println(func3.apply(10, 20));

	}

}
