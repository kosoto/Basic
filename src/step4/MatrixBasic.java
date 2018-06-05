package step4;

public class MatrixBasic {

	public static void main(String[] args) {
		int k = 0;
		int[][] mtx = new int[5][5];
		for(int i =0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				k++;
				mtx[i][j]=k;
				
				System.out.print("["+i +","+ j+"]");
			}
			
			System.out.println();
		}
	}
}
