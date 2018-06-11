package step4;

public class Snail {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int rotation = 5, sign = 1, row = 0, column=-1, count=1;
		for(int k=0;k<5;k++) {
			for(int i=0;i<rotation;i++) {
				column+=sign;
				mtx[row][column]=count++;
			}
			rotation--;
			for(int j=0;j<rotation;j++) {
				row+=sign;
				mtx[row][column]=count++;
			}
			sign*=-1;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mtx[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
