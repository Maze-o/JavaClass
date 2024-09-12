package CH03;

public class C04TypeChange {
	public static void main(String[] args) {
//		byte x = 10;
//		byte y = 20;
//		short z = 30;
//		char u = 40;
//		int result1 = x + y + z + u;
//		byte result2 = (byte) (x + y);

//		int result1 = x + y;
//		System.out.println(result1);

//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000L;
//		int result = var1 + var2 + var3;
//		
//		long result2 = var1 + var2 + var3;
//		System.out.println(result2);

//		int intVar = 10;
//		float flvar = 3.3F;
//		double dbvar = 5.5;
//		int result3 = intVar + (int)flvar + (int)dbvar;
//		double result4 = intVar + flvar + dbvar;
//		System.out.println(result3);

		int num1 = 10, num2 = 4;

		double dnum1 = (double) num1 / num2;
		double dnum2 = (num1 * 1.0) / num2;
		double dnum3 = (1.0 * num1) / num2;
		double dnum4 = num1 / num2;

		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);
		System.out.println("dnum4 : " + dnum4);

	}
}
