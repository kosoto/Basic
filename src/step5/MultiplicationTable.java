package step5;
import java.util.Arrays;
public class MultiplicationTable {
	public static void main(String[] args) {
		String result="";
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				result +=j + "X" + i +"="+ (i*j)+"\t";
			}	
			result +="\n";
		}
		System.out.println(result);
	}
}
