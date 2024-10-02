package CH07;

import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;

public class C03Continue_Break {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int n;
//		int sum = 0;
//
//		while (true) {
//			System.out.print("값 입력 : ");
//			n = sc.nextInt();
//			if (n == -1) {
//				break;
//			}
//			sum += n;
//		}
//		System.out.println("sum : " + sum);

//		boolean isExit = false;
//		int dan = 2;
//		while (dan <= 9) {
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//
//				if (dan == 7 && i == 7) {
//					isExit = true;
//					break;
//				}
//				i++;
//
//			}
//
//			if (isExit) {
//				break;
//			}
//
//			dan++;
//		}

//		int dan = 2;
//		Exit: while (dan <= 9) {
//			int i = 1;
//
//			while (i <= 9) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//
//				if (dan == 7 && i == 7) {
//					break Exit;
//
//				}
//
//				i++;
//			}
//
//			dan++;
//		}
		int i = 1;
		int sum = 0;

		while (i <= 10) {
			if (i % 3 == 0) {
				i++;
				continue;
			}
			System.out.println("i : " + i);
			sum += i;
			i++;

		}

		System.out.println("sum : " + sum);

		sc.close();
	}

}
