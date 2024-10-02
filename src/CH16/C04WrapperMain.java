package CH16;

public class C04WrapperMain {

	public static void main(String[] args) {

		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("100");
		Integer ob3 = Integer.valueOf("300");

		int n1 = ob1.intValue();
		int n2 = ob2.intValue();
		int n3 = ob3.intValue();
		System.out.println(n1 + n2 + n3);

		Integer ob4 = 100;
		int n4 = ob1 + ob2 + ob3;
		System.out.println(n4);

	}
}
