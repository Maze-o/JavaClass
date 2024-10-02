package CH14;

public class C02AbstractMain {
	
	public static void writing(문방구 tool) {
		tool.쓰기();
	}
	
	public static void main(String[] args) {
		writing(new 볼팬());
		writing(new 샤프());
		

	}
}

abstract class 문방구 {
	abstract void 쓰기();
}

class 샤프 extends 문방구 {
	@Override
	void 쓰기() {
		System.out.println("샤프가 씁니다");
	}
	
}

class 볼팬 extends 문방구 {
	@Override
	void 쓰기() {
		System.out.println("볼팬이 씁니다");
	}
}


