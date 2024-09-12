package CH04;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String str1 = sc.next();
		
		System.out.printf("%s님의 나이를 입력하세요 : ", str1);
		int n1 = sc.nextInt();
		
		System.out.printf("%s님의 주소를 입력하세요 : ", str1);
		sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.printf("%s님의 나이는 %d세 주소는 %s 입니다", str1, n1, str2);
		
		
		
		
	}
}
