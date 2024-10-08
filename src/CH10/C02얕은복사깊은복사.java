package CH10;

import java.util.Arrays;

public class C02얕은복사깊은복사 {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30 };
		int arr2[];
		arr2 = arr1;
		arr1[0] = 100;

		for (int val : arr2) {
			System.out.println(val + "");
		}

		System.out.println();

		int arr3[] = new int[3];

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];
		}
		
		int arr4[] = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr3 : " + arr3);
		System.out.println("arr4 : " + arr4);
		
		Arrays.stream(arr4).forEach(el -> System.out.println(el));

	}
}
