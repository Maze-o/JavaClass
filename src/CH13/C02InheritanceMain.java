package CH13;

public class C02InheritanceMain {
	public static void main(String[] args) {
//		Point3D obj = new Point3D(20);
//		Point3D obj = new Point3D(20, 30);
		Point3D obj = new Point3D(20, 30, 30);
//		obj.x = 10;
//		obj.y = 10;
//		obj.z = 10;
		System.out.println(obj);

	}
}

class Point2D {
	int x;
	int y;

	Point2D() {
		System.out.println("Point2D 생성자 호출");
	}

	Point2D(int x) {
		this.x = x;
		System.out.println("Point2Dintx 생성자 호출");
	}

	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2Dintx inty 생성자 호출");
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

}

class Point3D extends Point2D {
	int z;

	Point3D() {
		super();
		System.out.println("Point3D 생성자 호출");
	}

	Point3D(int x) {
		super(x);
		System.out.println("Point3Dintx 생성자 호출");
	}

	Point3D(int x, int y) {
		super(x, y);
		System.out.println("Point3Dintx inty 생성자 호출");
	}

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3Dintx inty intz 생성자 호출");
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}

}

