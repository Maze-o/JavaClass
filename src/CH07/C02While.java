package CH07;

import java.util.Scanner;

public class C02While {
	public static void main(String[] args) {
//		int i = 2;
//		int j = 1;
//
//		while (i <= 9) {
//			System.out.printf("%d 단 : \n", i);
//
//			while (j <= 9) {
//				System.out.println(i + "X" + j + "=" + (i * j));
//
//				j++;
//			}
//			j = 1;
//			i++;
//
//		}

//		int i = 2;
//		int j = 9;
//
//		while (i <= 9) {
//			System.out.printf("%d 단 : \n", i);
//
//			while (j > 0) {
//				System.out.println(i + "X" + j + "=" + (i * j));
//
//				j--;
//			}
//			j = 9;
//			i++;
//
//		}

//		Scanner sc = new Scanner(System.in);

//		System.out.println("몇단까지 ? : ");
//		int dan = sc.nextInt();
//		
//		int j = 1;
//		int i = 2;
//		while (i <= dan) {
//			
//			System.out.printf("%d단 : \n", i);
//			
//			while (j <= 9) {
//				System.out.println(i + "X" + j + "=" + (i * j));
//				j++;
//			}
//			
//			j=1;
//			i++;
//		}
//		sc.close();

//		System.out.println("몇단부터 : ");
//		int srt = sc.nextInt();
//		
//		System.out.println("몇단까지 : ");
//		int end = sc.nextInt();
//		
//	
//		
//		
//		int j = 1;
//		
//		if (end > 9) {
//			System.out.println("9단까지만 입력 가능합니다 다시 입력해주세요");
//			sc.close();
//			
//		} else if (srt < 2) {
//			System.out.println("2단부터 입력 가능합니다 다시 입력해주세요");
//			sc.close();
//		}
//		else {
//			System.out.printf("%d단 부터 \n", srt);
//			System.out.printf("%d단 까지 출력합니다 \n", end);
//			System.out.println();
//					
//			while (srt <= end) {
//				System.out.printf("%d단 \n", srt);
//				while (j <= 9) {
//					System.out.println(srt + "X" + j + "=" + (srt * j));
//					j++;
//				}
//				
//				j=1;
//				System.out.println();
//				srt++;
//			}
//		}
//		
//		sc.close();

		// 별찍기(기본높이:4)
		// *****
		// *****
		// *****
		// *****

//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇줄 ? : ");
//		int height = sc.nextInt();
//		
//		int i = 1;
//		int j = 1;
//		while (i <= height) {
//			System.out.printf("%d번째 줄 : ", i);
//			while (j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			j = 1;
//			System.out.println();
//			i++;
//		}

		// *
		// **
		// ***
		// ****

//		int i = 1;
//		int j = 1;

//		while (i <= 4) {
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			j = 1;
//			System.out.println();
//			i++;
//		}

		// ****
		// ***
		// **
		// *

//		int i = 1;
//		int j = 4;
//		
//		while (i <= 4) {
//			while (j >= i) {
//				System.out.print("*");
//				j--;
//			}
//			
//			j=4;
//			System.out.println();
//			i++;
//			
//		}

		// *
		// ***
		// *****
		// *******

//		int i = 1;
//		int j = 1;
//
//		while (i <= 4) {
//			System.out.print("*");
//			while (j < i) {
//				System.out.print("**");
//
//				j++;
//			}
//			
//			j = 1;
//			System.out.println();
//			i++;
//
//		}

		// *******
		// *****
		// ***
		// *

//		int i = 1;
//		int j = 4;
//
//		while (i <= 4) {
//			System.out.print("*");
//			while (j > i) {
//				System.out.print("**");
//
//				j--;
//			}
//			
//			j = 4;
//			System.out.println();
//			i++;
//
//		}

		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *

//		int i = 1;
//		int j = 1;
//
//		while (i <= 4) {
//			System.out.print("*");
//			while (j < i) {
//				System.out.print("**");
//				j++;
//			}
//
//			j = 1;
//			System.out.println();
//			i++;
//		}
//		int x = 1;
//		int y = 4;
//
//		while (x < 4) {
//			System.out.print("*");
//			
//			while (y-1 > x) {
//				System.out.print("**");
//				y--;
//			}
//			
//			y = 4;
//			System.out.println();
//			x++;
//			
//		}

		// *******
		// *****
		// ***
		// *
		// *
		// ***
		// *****
		// *******

//		int i = 1;
//		int j = 4;
//
//		while (i <= 4) {
//			System.out.print("*");
//			while (j > i) {
//				System.out.print("**");
//				j--;
//			}
//
//			
//			j = 4;
//			System.out.println();
//			i++;
//		}
//		
//		int x = 1;
//		int y = 1;
//		
//		while (x <= 4 ) {
//			System.out.print("*");
//			
//			while (y < x) {
//				System.out.print("**");
//				y++;
//			}
//			
//			y=1;
//			System.out.println();
//			x++;
//		}

//		   *
//		  ***
//		 *****
//		*******
		int i = 0;
		int j = 0;
		int k = 0;

		int z = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("높이입력");
		int h = sc.nextInt();

		while (i < h) {

			if (i <= (h / 2)) {
				j = 0;
				while (j <= (h / 2) - i) {
					System.out.print(" ");
					j++;
				}

				k = 0;
				while (k <= 2 * i) {
					System.out.print("*");
					k++;
				}

				System.out.println();

			} else if (i > (h / 2)) {

				while (z <= h / 2) {
					j = 0;
					while (j <= i - 4 ) {
						System.out.print("");
						j++;
					}

					k = 0;
					while (k <= h*2 - i) {
						System.out.print("*");
						k++;
					}
					System.out.println();
					z++;

				}
			}

			i++;
		}

		// 별찍기(기본높이:h)

	}

}
