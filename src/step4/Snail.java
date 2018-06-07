package step4;

public class Snail {
	public static void main(String[] args) {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0,row1=0,row2=1,column1=0,column2=4;
		for(int l=0;l<5;l++) {
			for(int j=0;j<5-l;j++) {
				count++;
				mtx[row1][column1+j*((int)Math.pow(-1, l))]=count;
			}
			row1+=(int)Math.pow(-1, l)*(4-l);
			column1+=(int)Math.pow(-1, l)*(3-l);
			for(int i=0;i<4-l;i++) {
				count++;
				mtx[row2+i*((int)Math.pow(-1, l))][column2]=count;
			}
			column2+=(int)Math.pow(-1, l+1)*(4-l);
			row2+=(int)Math.pow(-1, l)*(2-l);
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
