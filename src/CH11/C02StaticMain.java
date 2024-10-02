package CH11;

public class C02StaticMain {
	public static void main(String[] args) {
		
	}
	
}

class C02Simple {
	int n1;
	static int n2;
	
	void func1() {
		n1 = 10;
		n2 = 20;
	}
	
	static void func2() {
		n2 = 10;
//		n1 = 20; 
	}
	
}
