package CH03;

import java.util.Scanner;

public class C02TypeChange {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println((int) charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		
	}

}
