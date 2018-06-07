package step4;

public class Diagonal {
	public static void main(String[] args) {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		int row=0,column=0;
		for(int k=0;k<=8;k++) {
			if(k<=4) {
				for(int i=0;i<=k;i++) {
					count++;
					mtx[row+i][column-i]=count;
				}	
				column++;
			}else {
				for(int i=0;i<=8-k;i++) {
					count++;
					mtx[row+i+1][column-1-i]=count;
				}
				row++;
			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j] +"\t";
			}
			result += "\n";
		}
		System.out.println(result);
	}
}
