package CH18;

public class C02GenericMain {
	public static void main(String[] args) {
		PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
		System.out.println(ob1);

		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
	}
}

class PopCorn<T> {
	private T mat;

	PopCorn(T mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "팝콘의 맛은 : " + mat;
	}
}

class 캬라멜 {

	@Override
	public String toString() {
		return "캬라멜";
	}

}

class 버터옥수수 {

	@Override
	public String toString() {
		return "버터옥수수";
	}

}
