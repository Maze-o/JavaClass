package CH08;


public class C02PersonMain {
	public static void main(String[] args) {

		C02Person hong = new C02Person();
		hong.name = "홍길동";
		hong.age = 44;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("이름 : %s\n나이 : %d\n키 : %f\n몸무게 : %f\n" , hong.name, hong.age, hong.height, hong.weight);
	}

}

class C02Person {
	String name;
	int age;
	float height;
	double weight;
}