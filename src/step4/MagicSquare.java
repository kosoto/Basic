package step4;

public class MagicSquare {
	public static void main(String[] args) {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		int row = 0;
		int column = 2;
		for(int k=0;k<5;k++) {
			for(int i=0;i<5;i++) {
				count++;
				mtx[(row-i+5)%5][(column+i)%5]=count;
			}
			row = (row - 4 +5)%5 +1;
			column = (column+4)%5;
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j]+"\t";
			}
			result +="\n";
		}
		System.out.println(result);
	}
}
