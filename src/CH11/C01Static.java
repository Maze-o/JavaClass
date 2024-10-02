package CH11;

public class C01Static {
	public static void main(String[] args) {
		
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
		int dd = C01Simple.num1 = 100;
		System.out.println("num1 : " + dd);
		
		System.out.println("ob1's num : " + ob1.num1);
		System.out.println("ob2's num : " + ob2.num1);
		
	}
}


class C01Simple {
	static int num1;
	int num2;
	
	C01Simple() {
		this.num1 = 0;
		this.num2 = 0;
	}

	@Override
	public String toString() {
		return "C01Simple [num2=" + num2 + "]";
	}

	
	
	
}
