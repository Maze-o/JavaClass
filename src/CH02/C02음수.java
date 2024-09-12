package CH02;

public class C02음수 {
	public static void main(String[] args) {
		//컴퓨터 (CPU)는 가산회로에 의해 가산작업(덧겜처리) 를 할 수 있다(0)
		//컴퓨터 (CPU)는 뺄셈처리를 할 수 없다 

		byte a = 0b00000001;
		byte b = (byte) - 129;
		System.out.println(a);
		
		System.out.println((byte)0b10101111);
		
//		96 - > 01100000 
//		-96 -> 10100000
//		
//		31 ->  00011111
//		-31 -> 11100001
//		
//		10101111 -> -128 + 32 + 8 + 4 + 2 + 1  
//		
//		
//		
//		
//		
//		
	}
}
