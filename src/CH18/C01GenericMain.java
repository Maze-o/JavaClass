package CH18;

public class C01GenericMain {
	public static void main(String[] args) {
		호빵<팥> 호빵1 = new 호빵<팥>(new 팥());
		호빵<야채> 호빵2 = new 호빵<야채>(new 야채());
		호빵<슈크림> 호빵3 = new 호빵<슈크림>(new 슈크림());
		호빵<피자> 호빵4 = new 호빵<피자>(new 피자());
//		호빵<민초> 호빵5 = new 호빵<민초>(new 민초());
		
		System.out.println(호빵1);
		System.out.println(호빵2);
		System.out.println(호빵3);
		System.out.println(호빵4);
//		System.out.println(호빵5);
	}
}

class 재료 {
	
}


class 민초 {
	@Override
	public String toString() {
		return "민트초코 ";
	}
}

class 야채 extends 재료 {

	@Override
	public String toString() {
		return "야채 ";
	}

}

class 팥 extends 재료 {
	@Override
	public String toString() {
		return "팥 ";
	}
}

class 슈크림 extends 재료 {
	@Override
	public String toString() {
		return "슈크림 ";
	}
}

class 피자 extends 재료 {
	@Override
	public String toString() {
		return "피자 ";
	}
}

class 호빵<T extends 재료> {
	private T meterial;

	호빵(T meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return "이 빵은 " + meterial + "호빵";
	}

}