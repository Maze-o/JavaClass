package CH08;

public class C07Method가변인자 {
	public static void main(String[] args) {
		C07Simple dd = new C07Simple();
		
		dd.sum(10);
		dd.sum(10, 20);
		dd.sum(10, 20, 30);
		dd.sum(10, 20, 30, 40);
		dd.sum(10, 20, 30, 40, 50);
		dd.sum(10, 20, 30, 40, 50, 60);
	}	
}

class C07Simple {
	
	int sum(int ...arg) {
		
		for (int num : arg) {
			System.out.println(num + " ");
		}
		System.out.println();
		
		return 0;
	}
}