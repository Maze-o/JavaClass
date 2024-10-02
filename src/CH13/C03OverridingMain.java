package CH13;

public class C03OverridingMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sound();

		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		System.out.println();

		animal = dog;
		animal.sound();

		animal = cat;
		animal.sound();
		
		

	}
}

class Animal {
	void sound() {
		System.out.println("소리낸다");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("냥냥");
	}
}