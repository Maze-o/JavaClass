package CH04;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.err.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + num1);
//		
//		System.out.println("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);
//		
//		System.out.println("문자열 입력 : ");
//		String str1 = sc.next();
//		System.out.println("입력된 문자열 : " + str1);
//		
//		System.out.println("입력 : ");
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n" + s1, s2, s3);

//		System.out.print("문자열 입력 : ");
//		String str2 = sc.nextLine();
//		System.out.println("문자열 : " + str2);

		System.out.print("정수값 입력 : ");
		double n1 = sc.nextInt();
		System.out.println("정수값 :  " + n1);
		
		System.out.print("실수값 입력 : ");
		double n2 = sc.nextDouble();
		
		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine();
		System.out.println("문자열 : " + str2);
		
		System.out.print("문자열 입력 : ");	
		String str1  = sc.next();
		System.out.println("문자열 : " + str1);
		
		System.out.println("프로그램을 종료합니다");
	}
}
