package CH14;

public class Edasd {
	public static void main(String[] args) {
		int i, j, plus;
		int arr[][] = new int[5][5];
		plus = 0;
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 4; j++) {
				plus = plus + 1;
				arr[i][j] = plus;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(arr.length);

	}
}
