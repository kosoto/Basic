package step5;
import java.util.Arrays;
public class MultiplicationTable2 {
	public static void main(String[] args) {
		String[][] mtx = new String[1][8];
		String[][] multiplicationTable = new String[9][8]; 
		String result="";
		String results="";
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				result += i + "X" + j +"="+ (i*j)+"\n";
			}	
			
			//results=(i==6)?result+"\n":result;
			mtx[0][i-2]=(i==6)?result+"\n":result;
		}
		
		System.out.print(result);
		//System.out.println(multiplicationTable);
		for(int i=0;i<9;i++) {
			System.out.print(mtx[0][i]);
			
		}
	}
}
