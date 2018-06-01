package step2;

/**
[요구사항] 평균 점수에 따라 A ~ F 까지 등급을 부여하는
프로그램을 작성해 주시오.
100 ~ 90 A
89 ~ 80 B
79 ~ 70 C
69 ~ 60 D
59 ~ 50 E
49 ~ 0 F
화면 출력은 다음과 같습니다.
********************************
| 이름 | 총점 | 평균 등급 |
--------------------------------
| 홍길동 | 270 | 90 | A |
 * */
import java.util.Scanner;

public class GradeReport {
	public static int[] input(Scanner scan) {
		int[] result = new int[3];
		System.out.println("국어 점수를 입력하세요.");
		result[0] = scan.nextInt();

		System.out.println("영어 점수를 입력하세요.");
		result[1] = scan.nextInt();

		System.out.println("수학 점수를 입력하세요.");
		result[2] = scan.nextInt();
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		String grade = "";
		while (true) {
			System.out.println("0.정지 1.실행");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("이름을 입력하세요.");
				String name = scan.next();

				/*
				 * System.out.println("국어 점수를 입력하세요."); num1 = scan.nextInt();
				 * 
				 * System.out.println("영어 점수를 입력하세요."); num2 = scan.nextInt();
				 * 
				 * System.out.println("수학 점수를 입력하세요."); num3 = scan.nextInt();
				 */
				int[] arr = input(scan);
				num1 = arr[0];
				num2 = arr[1];
				num3 = arr[2];

				String result = "";
				if (num1 > 100 || num2 > 100 || num3 > 100) {
					result = "잘못된 점수를 입력하였습니다.";
				}
				num4 = (num1 + num2 + num3) / 3;
				grade = "F";
				if (num4 >= 90) {
					grade = "A";
				} else if (num4 >= 80) {
					grade = "B";
				} else if (num4 >= 70) {
					grade = "C";
				} else if (num4 >= 60) {
					grade = "D";
				} else if (num4 > 50) {
					grade = "E";
				}
				if (!result.equals("잘못된 점수를 입력하였습니다.")) {
					result = "| " + name + " |  " + (num1 + num2 + num3) + "  |  " + num4 + "  |  " + grade + " |";
				}
				System.out.printf("****************************\n");
				System.out.printf("|  이름  |  총점   |  평균  | 등급 |\n");
				System.out.printf("----------------------------\n");
				//System.out.printf(result);
				System.out.printf("|  %s  |  %d   |  %d  | %s |\n",name,num1+num2+num3,num4,grade);
				System.out.println("****************************");
				break;
			default:
				break;
			}
		}
	}
}