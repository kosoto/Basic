package step4;
import java.util.Scanner;
public class MagicSquareNxN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력");
		int n = s.nextInt();
		String result = "";
		int[][] mtx = new int[n][n];
		int count = 0;
		int row = 0;
		int column = n/2;
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				count++;
				mtx[(row-i+n)%n][(column+i)%n]=count;
			}
			row = (row +1)%n +1;
			column = (column+n-1)%n;
		}
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				result += mtx[i][j]+"\t";
			}
			result +="\n";
		}
		System.out.println(result);
	}
}
