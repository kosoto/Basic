package step4;

public class Zigzag {

	public static void main(String[] args) {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					count++;
					mtx[i][j] = count;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j]+"\t";
			}
			result += "\n";
		}
		System.out.println(result);
	}
}
