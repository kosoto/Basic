package example;
import java.util.Scanner;
public class example2_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		int num1=s.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		int num2=s.nextInt();
		System.out.print("세번째 계산할 값을 입력하세요 ==>");
		int num3=s.nextInt();
		System.out.print("네번째 계산할 값을 입력하세요 ==>");
		int num4=s.nextInt();
		int num5 = num1+num2+num3+num4;
		System.out.println(num1 +"+"+num2+"+"+num3+"+"+num4+"="+num5);
		
	}

}
