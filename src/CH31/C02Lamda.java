package CH31;

public class C02Lamda {
	public static void main(String[] args) {
//		Printer printer = (message) -> {
//			System.out.println(message);
//		};
//		printer.print("gd");

//		Printer printer = (message) -> {
//			return message;
//		};
//		String msg = printer.print("HELLO");
//		System.out.println(msg);

		Printer printer = (message) -> message + "!!!";
		String msg = printer.print("TEST");
		System.out.println(msg);
		
	}
}

interface Printer {
//	void print(String message);

	String print(String message);

//	String print();

}
