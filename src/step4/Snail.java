package step4;

public class Snail {
	// 달팽이 만들기
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int count = 0;
		
		for (int j = 0; j < 5; j++) {
			count++;
			mtx[0][j] = count;
		}//1~5
		for (int i = 1; i < 5; i++) {
			count++;
			mtx[i][4] = count;

		}//6~9
		for (int j = 3; j>=0; j--) {
			count++;
			mtx[4][j] = count;

		}//10~13
		for (int i = 3; i>=1; i--) {
			count++;
			mtx[i][0] = count;

		}//14~16
		for (int j = 1; j<=3; j++) {
			count++;
			mtx[1][j] = count;

		}//17~19
		for (int i = 2; i<=3; i++) {
			count++;
			mtx[i][3] = count;

		}//20~21
		for (int j = 2; j>=1; j--) {
			count++;
			mtx[3][j] = count;

		}//22~23
			count++;
			mtx[2][1] = count; //24
			count++;
			mtx[2][2] = count;	//25


		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j] + " ");

			}
			System.out.println();
		}
	}

}
