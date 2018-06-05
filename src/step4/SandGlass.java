package step4;

public class SandGlass {
//모래시계
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if(i<3) {
				for (int j = 0+i; j < 5-i; j++) {
					count++;
					mtx[i][j] = count;

				}
			}else {
				for (int j = 4-i; j < i+1; j++) {
					count++;
					mtx[i][j] = count;

				}
			}



		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j]+" ");

			}
			System.out.println();
		}
	}

}