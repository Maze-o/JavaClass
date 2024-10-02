package CH19;

import java.util.HashMap;
import java.util.Map;

public class C04MapMain {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();

		map.put("aaa", 1234);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);
		map.put("ddd", 5555);

		map.remove("aaa");
		System.out.println("SIZE : " + map.size());

		System.out.println(map.get("bbb"));

		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		

	}
}