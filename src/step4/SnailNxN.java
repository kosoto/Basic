package step4;
import java.util.Scanner;
public class SnailNxN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String result = "";
		System.out.println("정수를 입력");
		int n = s.nextInt();
		int[][] mtx = new int[n][n];
		int count = 0;
		int row1=0,row2=1,column1=0,column2=n-1;
		for(int l=0;l<n;l++) {
			for(int j=0;j<n-l;j++) {
				count++;
				mtx[row1][column1+j*((int)Math.pow(-1, l))]=count;
			}
			row1+=(int)Math.pow(-1, l)*(n-1-l);
			column1+=(int)Math.pow(-1, l)*(n-2-l);
			for(int i=0;i<n-1-l;i++) {
				count++;
				mtx[row2+i*((int)Math.pow(-1, l))][column2]=count;
				
			}
			column2+=(int)Math.pow(-1, l+1)*(n-1-l);
			row2+=(int)Math.pow(-1, l)*(n-3-l);
		}
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				result += mtx[i][j]+"\t";
			}
			result+="\n";
		}
		System.out.println(result);
	}

}
