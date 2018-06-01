package step2;

/**
 [수열012] 홀수짝수의 합계
 * 
 * */
import java.util.Scanner;
public class Seq012_2 {
	public static void input(Scanner s) {
		
		System.out.println("두 정수를 입력");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int start = (num1 > num2) ? num2 : num1;
		int end = (num1 > num2) ? num1 : num2;
		start = (start % 2 == 0) ? start : start++;
		end = (end % 2 == 0) ? end : end--; 
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2, start, end, sum = 0, count = 0, totalcount = 0;
		String result = "";
		while (true) {
			result = "";
			sum = 0;
			System.out.println("0.종료 1.짝수합 2.홀수합");
			//flag = s.nextInt();
		/*	System.out.println("두 정수를 입력");
			num1 = s.nextInt();
			num2 = s.nextInt();*/
			switch (s.nextInt()) {
			case 0:
				return;
			case 1:
				for(int i = start; i < end++; i++){
					if (i % 2 == 0) {
						totalcount++;
					}
				}
				for (int i = start; i < end++; i++) {
					if (i % 2 == 0) {
						if(count==totalcount) {
							result += i + " = ";
						}else {
							result += i + " + ";
						}
						count++;
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				//
				for (int i = start; i < end++; i++) {
					if (i % 2 == 1) {
						result += (i == end) ? i + " = " : i + " + ";
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			default:
				return;
			}
		}
	}
}
