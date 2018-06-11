package step4;
import java.util.Scanner;
public class MagicSquareNxN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력");
		int n = s.nextInt(),count=0,row=0,column=n/2;
		String result = "";
		int[][] mtx = new int[n][n];
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				count++;
				mtx[(row-i+(n*n))%n][(column+i)%n]=count;
			}
			row-=n-2;
			column+=n-1;
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
