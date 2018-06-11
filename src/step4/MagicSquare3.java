package step4;

public class MagicSquare3 {
	public static void main(String[] args) {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		int row = 0;
		int column = 2;
		for(int k=0;k<5;k++) {
			for(int i=0;i<5;i++) {
				count++;
				mtx[(row+25)%5][column%5]=count;
				row--;
				column++;
			}
			row+=2;
			column--;
			
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
