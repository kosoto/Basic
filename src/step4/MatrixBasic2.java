package step4;

public class MatrixBasic2 {

	public static void main(String[] args) {
		int[][] mtx=new int[5][5];
		int count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				count++;
				mtx[j][i]=count;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			System.out.print(mtx[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
