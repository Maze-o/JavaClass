package CH17;

public class C04ExceptionMain {
	public static void main(String[] args) {
		String str = null;
		try {
			str.toString();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		int arr[] = { 10, 20, 30 };
		arr[5] = 100;

		try {
			Integer.parseInt("a1234");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		}

		Animal animal = new Dog();
		try {
			Cat yummi = (Cat) animal;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}
}
