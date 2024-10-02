package CH08;

import java.util.Scanner;

public class C04MethodMain {

	public static void main(String[] args) {
		MethodTest sumCalc = new MethodTest();
		
		System.out.println("sum1 : " + sumCalc.sum1(10, 20));
		System.out.println("sum2 : " + sumCalc.sum2());
		sumCalc.sum3(10, 20);
		sumCalc.sum4();
		
	}

}

class MethodTest {

	Scanner sc = new Scanner(System.in);

	public int sum1(int n1, int n2) {
		return n1 + n2;
	}

	public int sum2() {
		System.out.print("sum2 값 입력 : ");
		return sc.nextInt() + sc.nextInt();
	}

	public void sum3(int n1, int n2) {
		System.out.println("sum3 : " + n1 + n2);
	}

	public void sum4() {
		System.out.print("sum4 값 입력 : ");
		System.out.println("sum4 : " + sc.nextInt() + sc.nextInt());

	}

}
