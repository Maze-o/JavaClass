package CH29;

import java.lang.reflect.Method;

public class C01Basic {
	public static void main(String[] args) throws Exception {
//		System.out.println(Sample.class);
		Class<?> clazz = Class.forName("java.lang.String");
//		Field[] fields = clazz.getDeclaredFields();
//		
//		for (Field field : fields) {
//			System.out.println(field);
//		}
		
//		Constructor[] constructors = clazz.getDeclaredConstructors();
//		
//		for(Constructor con : constructors) {
//			System.out.println(con);
//		}
		
		Method[] methods = clazz.getDeclaredMethods();	
		
		for (Method m : methods) {
			System.out.println(m);
		}
		
	}
	
}

class Sample {
	String name;
	int age;
	String addr;
	
	@Override
	public String toString() {
		return "Sample [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}
