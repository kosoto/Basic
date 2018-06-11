package step4;

public class MagicSquare2 {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		String result = "";
		int count=0,row=0,column=2;
		for(int j =0;j<5;j++) {
			for(int i=0;i<5;i++) {
				count++;
				mtx[(row-i+50)%5][(column+i)%5]=count;
			}
			row-=3;
			column +=4;	
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