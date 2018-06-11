package example;
import java.util.Scanner;
public class example3_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력 ==>");
		String input = s.next();
		for(int i =input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));
		}
	}
}
