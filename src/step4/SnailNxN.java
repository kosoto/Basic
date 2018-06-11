package step4;
import java.util.Scanner;
public class SnailNxN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String result = "";
		System.out.println("정수를 입력");
		int n = s.nextInt();
		int[][] mtx = new int[n][n];
		int count = 1,row=0,column=-1,sign=1,rotation=n;
		for(int l=0;l<n;l++) {
			for(int j=0;j<rotation;j++) {
				column+=sign;
				mtx[row][column]=count++;
			}
			rotation--;
			for(int i=0;i<rotation;i++) {
				row+=sign;
				mtx[row][column]=count++;
			}
			sign*=-1;
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
