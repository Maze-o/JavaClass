package CH19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03Ex {
	public static void main(String[] args) {
		
		// 1~45 까지 숫자를 6개 랜덤으로 받아 set에 저장
		// [추가] 저장된 set의 오름차순정렬
		
		Set<Integer> set = new TreeSet();
		Random rnd = new Random();
		
		
		for (int i = 0; i < 6; i++) {
			set.add(rnd.nextInt(45) + 1);
		}
		
		
		
		System.out.println(set);
		
		
		
		
	}
}
