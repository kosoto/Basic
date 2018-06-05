package step4;

public class MatrixProblem6 {
//오른쪽에 빈삼각형
	public static void main(String[] args) {
		int[][] mtx = new int[7][7];
		int count = 0;
		for (int i = 0; i < 7; i++) {
			if(i<4){
				for (int j = 0; j < 7-i; j++) {
					count++;
					mtx[i][j] = count;

				}
				
			}else {
				for (int j = 0; j < i+1; j++) {
					count++;
					mtx[i][j] = count;

				}
				
			}
			

		}
		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 7; j++) {
				System.out.print(mtx[i][j]+" ");

			}
			System.out.println();
		}
	}

}
