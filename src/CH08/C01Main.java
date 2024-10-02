package CH08;

public class C01Main {
	public static void main(String[] args) {
		C01 c01 = new C01();
		
		c01.setName("홍길동");
		c01.setAge(31);
		c01.setWeight(70.5);
		c01.setHeight(177.5f);
		System.out.printf("이름 : %s\n나이 : %d\n몸무게 : %f \n키 : %f\n", c01.getName(), c01.getAge(), c01.getWeight(), c01.getHeight());
	}
}
