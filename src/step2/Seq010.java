package step2;

/**
기사시험문제 : [수열1] 1+2+3+ ... + 100 까지의 합계
변형된 요구사항:
정수를 입력받아 두 수 사이의 합을 구하는
프로그램을 구현하시오
출력 : 1+2+3+...+10=55
 * */
import java.util.Scanner;

public class Seq010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		int num1 = 0, num2 = 0, sum = 0, start = 0, end = 0;
		while (true) {
			System.out.println("0.정지 1.실행"); 
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("두 정수를 입력하세요.");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				start = (num1 > num2) ? num2 : num1;
				end = (num1 > num2) ? num1 : num2;
				for (int i = start; i < end + 1; i++) {
					result += (i == end) ? i + " = " : i + " + ";
					sum += i;
				}
				System.out.println(result + sum);
				result = "";
				sum = 0;
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		}
	}
}
