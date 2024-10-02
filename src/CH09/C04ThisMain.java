package CH09;

public class C04ThisMain {
	public static void main(String[] args) {
		C04Simple dd = new C04Simple();
		
		System.out.println(dd);
		
		System.out.println(dd.getThis());
	}
}

class C04Simple {
	int x;
	int y;

	C04Simple() {
//		this.x = 0;
//		this.y = 0;
		this(0, 0);
	}

	C04Simple(int x) {
//		this.x = x;
//		this.y = 0;
		this(x, 0);
	}

	C04Simple(int x, int y) {
		this.x = x;
		this.y = y;

	}

	C04Simple getThis() {
		return this;
	}
}
