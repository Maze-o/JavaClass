package CH15;

public class C04EX {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}

class TV2 {
	private int size;

	public TV2(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV2 {
	private int inch;
	public ColorTV(int inch, int size) {
		super(size);
		this.inch = inch;
	}
	
	void printProperty() {
		System.out.println(inch + " " +  getSize());
	}

	
}