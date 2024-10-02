package CH10;

public class C03다차원배열 {

	public static void main(String[] args) {
		String board2[][] = { { "blue", "red", "orange", "red" }, { "red", "red", "blue", "orange" },
				{ "blue", "orange", "red", "red" }, { "orange", "orange", "red", "blue" } };
		int h = 1;
		int w = 0;
		int n = board2.length; // 4
		System.out.println("길이 : " + n);
		int count = 0;

		int[] dh = { 0, 1, -1, 0 };
		int[] dw = { 1, 0, 0, -1 };

		for (int i = 0; i < n; i++) { // 4번반복
			int h_check = h + dh[i]; // 1 + 0 hcheck=1
			System.out.println("HCHECK" + h_check);
			int w_check = w + dw[i]; // 1 + 1 wcheck = 2
			System.out.println("WCHECK" + w_check);
			System.out.println("for문반복" + i);
			System.out.println();
			if (h_check >= 0 && w_check >= 0) {
//			System.out.println("gd" + board2[h][w]);
//			System.out.println("gd2" + board2[h_check][w_check]);
			System.out.println("Current: " + board2[h][w]);
			System.out.println("Adjacent: " + board2[h_check][w_check]);
											// red                   red 
			System.out.println("같아 ? " + (board2[h][w]) == (board2[h_check][w_check]));
				if ((board2[h][w]) == (board2[h_check][w_check])) {
					System.out.println("같아");
					count++;

				}
			}

		}
		System.out.println(count);
	}

}
