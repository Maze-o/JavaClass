package CH04;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("n1 입력 : ");

		int n1 = sc.nextInt();
//		System.out.println("n1 : " + n1);

		int n2 = sc.nextInt();
//		System.out.println("n2 : " + n2);

		int n3 = sc.nextInt();
//		System.out.println("n3 : " + n3);

		int n4 = sc.nextInt();
//		System.out.println("n4 : " + n4);

		System.out.printf("%d %d %d %d", n1, n2, n3, n4);

		sc.close();

	}
}
