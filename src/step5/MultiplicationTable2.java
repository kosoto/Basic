package step5;
import java.util.Arrays;
public class MultiplicationTable2 {
	public static void main(String[] args) {
		int num1=2,num2=1,mult=0;
		String[][] multiplicationTable = new String[9][8]; 
		String result="";
		for(int j=2;j<10;j++) {
			for(int i=1;i<10;i++) {
				multiplicationTable[i-1][j-2]= j + "X" + (i) +"="+ (i*j)+"\n";
				
			}	
			
		}
		
		//System.out.print(result);
		System.out.println(multiplicationTable);
		for(int j=2;j<10;j++) {
			for(int i=1;i<10;i++) {
			System.out.print(multiplicationTable[i-1][j-2]);
				
			}	
			System.out.println();
		}
	}
}
