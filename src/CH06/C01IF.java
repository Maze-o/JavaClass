package CH06;

import java.util.Scanner;

public class C01IF {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("나이 : ");
//		int age = sc.nextInt();
//		
//		if (age >= 8) {
//			System.out.println("학교에 다닙니다");			
//		} 
//		System.out.println("첫번째 IF 블럭 종료");
//		
//		if (age <= 8) {
//			System.out.println("학교에 다니지 않습니다");
//		} 
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
//
//		System.out.println("나이 : ");
//		int age = sc.nextInt();
//
//		if (age >= 8) {
//			System.out.println("학교에 다닙니다");
//		} else {
//			System.out.println("학교에 다니지 않습니다");
//		}
//		
//		System.out.println("프로그램을 종료합니다");

//		System.out.println("수 입력 : ");
//		int i = sc.nextInt();
//
//		if ((i % 3 == 0) && (i % 5 == 0)) {
//			System.out.println("3이나 5의 배수 : " + i);
//		} else if (i % 3 == 0) {
//			System.out.println("3의 배수 : " + i);
//		} else if (i % 5 == 0) {
//			System.out.println("5의 배수 : " + i);
//		}
//		else {
//			System.out.println("아무것도 아님");
//		}
//
//		System.out.println("첫번째 수 입력 : ");
//		int n1 = sc.nextInt();
//
//		System.out.println("두번째 수 입력 : ");
//		int n2 = sc.nextInt();
//
//		System.out.println("세번째 수 입력 : ");
//		int n3 = sc.nextInt();
//
//		if (n1 > n2) {
//			System.out.println(n1 + "이 더 큽니다");
//		} else {
//			System.out.println(n2 + "이 더 큽니다");
//		}
//		System.out.println();
//
//		int sum = n1 + n2 + n3;
//		int sumval = (n1 + n2 + n3) / 3;
//		System.out.println("총합 : " + sum + "평균 : " + sumval);
//		System.out.println();
//
//		if ((n1 > n2) && (n1 > n3)) {
//			System.out.println(n1 + "이 젤 큼");
//		} else if (n2 > n3) {
//			System.out.println(n2 + "이 젤 큼");
//		} else {
//			System.out.println(n3 + "이 젤 큼");
//		}
//
//		if ((n1 < n2) && (n3 > n1)) {
//			System.out.println(n1 + "이 젤 작음");
//		} else if (n3 > n2) {
//			System.out.println(n2 + "이 젤 작음");
//		} else {
//			System.out.println(n3 + "이 젤 작음");
//		}

//
//		System.out.println("과목1 점수 입력 : ");
//		int n1 = sc.nextInt();
//
//		System.out.println("과목2 점수 입력 : ");
//		int n2 = sc.nextInt();
//
//		System.out.println("과목3 점수 입력 : ");
//		int n3 = sc.nextInt();
//
//		System.out.println("과목4 점수 입력 : ");
//		int n4 = sc.nextInt();
//
//		double avg = (n1 + n2 + n3 + n4) / 4;
//		System.out.println("평균 : " + avg);
//		
//		if ((n1 < 40) || (n2 < 40) || (n3 < 40) || (n4 < 40)) {
//			System.out.println("40점 미만인 과목이 있어서 탈락!");
//		} else if (avg < 70) {
//			System.out.println("평균이 안돼서 탈락!!");
//		}
		
		System.out.println("시험 점수를 입력하세요 : ");
		int n1 = sc.nextInt();
		
		if (n1 >= 90 ) {
			System.out.println("A등급!");
		} else if (n1 >= 80) { 
			System.out.println("B등급!");
		} else if (n1 >= 70) {
			System.out.println("C등급!");
		} else if (n1 >= 60) {
			System.out.println("D등급!");
		} else {
			System.out.println("삐빅 불합격!!!!!");
		}
		
		
		
		
		

		sc.close();
	}
}
