package step2;

/**
 [수열012] 홀수짝수의 합계
 * 
 * */
import java.util.Scanner;
public class Seq012 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.홀수합 2.짝수합");
			switch (s.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("두 정수를 입력하시오.");
				int num1 = s.nextInt();
				int num2 = s.nextInt();
				int sum = 0;
				int start = num1;
				int end = num2;
				int count = 1;
				int totalcount = 0;
				String result = "";
				if (num1 > num2) {
					start = num2;
					end = num1;
				}
				start = (start % 2 == 0) ? start++ : start;
				end = (end % 2 == 0) ? end-- : end;
				for (int i = start; i < end + 1; i++) {
					if (i % 2 != 0) {
						totalcount++;
					}
				}
				for (int i = start; i < end + 1; i++) {
					if (i % 2 != 0) {
						if (count == totalcount) {
							result += i + "=";
							sum += i;
						} else {
							result += i + "+";
							sum += i;
						}
						count++;
					}
				}
				System.out.println(result + sum);
				result = "";
				sum = 0;
				break;
			case 2:
				
				System.out.println("두 정수를 입력하시오.");
				num1 = s.nextInt();
				num2 = s.nextInt();
				sum = 0;
				start = num1;
				end = num2;
				count = 1;
				totalcount = 0;
				result = "";
				if (num1 > num2) {
					start = num2;
					end = num1;
				}
				start = (start % 2 == 0) ? start : start++;
				end = (end % 2 == 0) ? end : end--;
				for (int i = start; i < end + 1; i++) {
					if (i % 2 == 0) {
						totalcount++;
					}
				}
				for (int i = start; i < end + 1; i++) {
					if (i % 2 == 0) {
						if (count == totalcount) {
							result += i + "=";
							sum += i;
						} else {
							result += i + "+";
							sum += i;
						}
						count++;
					}

				}
				System.out.println(result + sum);
				result = "";
				sum = 0;
				break;
			default:
				return;
			}
		}
	}
}