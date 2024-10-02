package CH18;

import java.util.HashMap;
import java.util.Map;

public class C04GennericMain {
	
	public static <T extends Tiger> void PrintInfo(T[] arr) {
		for (T el : arr) {
			System.out.println(el);
		}
	}
	public static void PrintInfo2(Object[] arr) {
		for (Object el : arr) {
			System.out.println(el);
		}
	}

	public static void main(String[] args) {
		Tiger[] arr1 = {new Tiger("시베리안"), new Tiger("뱅갈"), new Tiger("백두산")};
		PrintInfo(arr1);
		System.out.println();
		Panda[] arr2 = {new Panda("중국"), new Panda("레서팬더"), new Panda("팬더팬더")};
		PrintInfo(arr2);
		System.out.println();
		Object[] arr3 = {new Tiger("시베리안"), new Panda("래서팬더"), new Cat("길고양이")};
		PrintInfo2(arr3);
		
		
		}
	

}

class Animal {
	
}

class Tiger {
	String name;

	public Tiger(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}

}

class Panda extends Tiger {
	String name;

	public Panda(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}

}
class Cat extends Animal {
	String name;
	
	public Cat(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
}