package CH08;

import java.util.Scanner;

public class C03PersonMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C03Person hong = new C03Person();
		hong.name = "홍길동";
		hong.age = 44;
		hong.height = 177.5f;
		hong.weight = 70.5;
		hong.walk();
		hong.talk();
		System.out.println(hong);
		
//		System.out.print("이름 입력 : ");
//		hong.name = sc.next();
//
//		hong.talk();
//		sc.close();
	}

}

class C03Person {
	String name;
	int age;
	float height;
	double weight;


	void talk() {
		System.out.println(this.name + "이 말합니다.");
	}

	void walk() {
		System.out.println(this.name + "이 걷습니다.");
	}
	
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}