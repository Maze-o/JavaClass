package CH29;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C02Basic {

	public static void main(String[] args) throws Exception {
		Simple ob = new Simple();
		ob.setAge(10);

		System.out.println(Simple.class);
		Class<?> clazz = Class.forName(String.valueOf(Simple.class).split(" ")[1]);
		Method method = clazz.getDeclaredMethod("getAge", null);
		Object result = method.invoke(ob, null);

		System.out.println(result);
		
		Constructor<?> constructor =  clazz.getConstructor(String.class);
		System.out.println(constructor);
		Object obj = constructor.newInstance("홍길동");
		System.out.println(obj);
		
		Field field = clazz.getDeclaredField("addr");	
		field.set(ob, "대구");
		System.out.println(ob);
		

	}

}

class Simple {
	String name;
	int age;
	String addr;

	public Simple() {

	}

	public Simple(String name) {
		this.name = name;
	}

	public Simple(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Simple(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Simple [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}
