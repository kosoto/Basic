package step4;
import java.util.Scanner;
public class Diamond2NxN {
//다이아몬드 홀수만..
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력");
		int n =s.nextInt();
		int[][] mtx = new int[n][n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(i<(n/2)+1) {
				for(int j=(n/2)-i;j<(n/2)+1+i;j++) {
					count++;
					mtx[i][j] = count;
				}	
			}else {
				for(int j=i-(n/2);j<=n+(n/2)-1-i;j++) {/// ???
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mtx[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
