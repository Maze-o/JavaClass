package CH19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C01Ex {

	static Scanner sc = new Scanner(System.in);

	public static void func1(List<String> list) {
		for (int i = 0; i < 5; i++) {
			System.out.print("정수형 입력 : ");
			String ll = sc.next();
			list.add(ll);
		}

		List<Integer> num = list.stream().map(Integer::parseInt).filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("짝수 : " + num);

	}

	public static List<String> func2(List<String> list) {
//		List<Integer> num = list.stream().map(Integer::parseInt).filter(i -> i % 2 == 0).collect(Collectors.toList());
		for (int i = 0; i < 5; i++) {
			System.out.print("아무 글씨나 입력 : ");
			String li = sc.next();
			list.add(li);
		}
		
		List<String> str = list.stream().filter(i -> i.length() >= 5).collect(Collectors.toList());
		System.out.println("길이가 5이상인 문자열 : " +  str);
		
		return str;
	}

	public static int func3(List<String> list) {
		//ArrayList에 있는 문자열 중에서 숫자형 데이터만 추출해서 합을 구해보세요
		
		for (int i =0 ; i < 5; i ++) { 
			System.out.println("글씨  입력 : ");
			String li = sc.next();
			list.add(li); 
		}
		
		
		return 0;
	}

	public static void main(String[] args) {
		List<String> li = new ArrayList();
		func1(li);

		List<String> returndList = func2(li);
		
		
		int sum = func3(returndList);

	}
}
