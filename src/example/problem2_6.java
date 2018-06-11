package example;
import java.util.Scanner;
public class problem2_6 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String[] num = {"첫","두","세","네"};
	int[] num2= new int[5];
	for(int i=0;i<4;i++) {
		System.out.print(num[i]+"번째 계산할 값을 입력하세요 ==>");
		num2[i] = s.nextInt();
	}
	num2[4] = num2[0]+num2[1]-num2[2]*num2[3];
	System.out.println(num2[0]+"+"+num2[1]+"-"+num2[2]+"*"+num2[3]+"="+num2[4]);
}
}
