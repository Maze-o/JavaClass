//package CH13;
//
//public class C01InheritanceMain {
//	public static void main(String[] args) {
//		Point3D obj = new Point3D();
//		obj.x = 10;
//		obj.y = 10;
//		obj.z = 10;
//		System.out.println(obj);
//
//	}
//}
//
//class Point2D {
//	int x;
//	int y;
//	
//	Point2D() {
//		System.out.println("Point2D 생성자 호출");
//	}
//
//	@Override
//	public String toString() {
//		return "Point2D [x=" + x + ", y=" + y + "]";
//	}
//
//}
//
//class Point3D extends Point2D {
//	int z;
//
//	Point3D() {
//		System.out.println("Point3D 생성자 호출");
//	}
//
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//
//}
