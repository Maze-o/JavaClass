package CH07;

import java.util.Scanner;

public class C01While {
	public static void main(String[] args) {

//		int num = 0;
//		int sum = 5;
//
//		while (num < sum) {
//			System.out.print("*");
//			num++;
//			if (num == sum) {
//				System.out.println();
//				num = 0;
//				sum--;
//				continue;
//
//			}
//
//		}

//		int i = 1;
//		int sum = 0;
//		while (i <= 10) {
//			System.out.println("i : " + i);
//			sum += i;
//			i++;
//		}
//		System.out.println("sum : " + sum);

		Scanner sc = new Scanner(System.in);

		int brk = 0;
		int sum = 0;

		System.out.println("N값 입력 : ");
		int n = sc.nextInt();

//		System.out.println("M값 입력 : ");
//		int m = sc.nextInt();

//		while (n > 0) {
//			sum += n;
//			
//			n--;
//		}
//		System.out.println(sum);

//		while (n < m) {
//			sum += n;
//			n++;
//			if (n == m) {
//				break;
//			}
//			
//			
//		}
//		System.out.println("합  : " + sum);

//		while (n > 0) {
//			sum += n;
//
//			if (n % 3 == 0 && n % 2 == 0) {
//				System.out.println("홀수이자 짝수 : " + n);
//			} else if ( n % 2 == 0) {
//				System.out.println("짝수 : " + n);
//			} else {
//				System.out.println("홀수 : " + n);
//			}
//			n--;
//
//		}
//		System.out.println("합 : " + sum);

//		while (n > 0) {
//
//			
//			if ( n % 3 == 0) {
//				sum += n;
//				System.out.println("3의 배수 : " + n);
//			}
//
//			n--;
//		}
//		System.out.println("합 : " + sum);

//		while (n > 0) {
//
//			if (n % 4 == 0) {
//				System.out.println("4의 배수 : " + n);
//			}
//			if (n % 4 != 0) {
//				sum += n;
//			}
//			n--;
//		}
//		System.out.println("4의 배수가 아닌 값의 합 : " + sum);
		int i = 1;
		int j = 1;
		while (n >= i) {
			System.out.printf("%d단 : \n", i);
			while (j <= 9) {
				
				System.out.println(i + "X" + j + "=" + (i * j));
				j++;
			}
			
			System.out.println();
			j=1;
			i++;
		}

	}

}
