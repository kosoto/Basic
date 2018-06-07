package step4;

public class MatixConversion {
	public static void main(String[] args) {
		String result = "";
		int[][] mtxA= new int[5][3];
		int[][] mtxB= new int[3][5];
		int count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				count++;
				mtxA[i][j]=count;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				mtxB[i][j]=mtxA[i+(2*i+j)/3][(2*i+j)%3];
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++) {
				result += mtxB[i][j]+"\t";
			}
			result += "\n";
		}
		System.out.println(result);
	}
	
}
