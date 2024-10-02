import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Solution ss = new Solution();
		int[][] data = { { 1, 20300104, 100, 80 }, { 2, 20300804, 847, 37 }, { 3, 20300401, 10, 8 } };

		ss.solution(data, "date", 203005051, "remain");
	}
}

class Solution {
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

		Map<String, Integer> map = new HashMap<>();
		map.put("code", 0);
		map.put("date", 1);
		map.put("maximum", 2);
		map.put("remain", 3);

		int[][] answer = Arrays.stream(data).filter(x -> x[map.get(ext)] < val_ext).toArray(int[][]::new);
		System.out.println(answer);
		Arrays.sort(answer, (o1, o2) -> o1[map.get(sort_by)] - o2[map.get(sort_by)]);

		return answer;
	}
}