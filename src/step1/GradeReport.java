package step1;
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

				System.out.println("국어 점수를 입력하세요.");
				num1 = scan.nextInt();

				System.out.println("영어 점수를 입력하세요.");
				num2 = scan.nextInt();

				System.out.println("수학 점수를 입력하세요.");
				num3 = scan.nextInt();

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
					result = name + "님의 평균은 " + num4 + "점," + " 학점은 " + grade + "입니다.";
				}
				System.out.println(result);
				break;
			default:
				break;
			}
		}
	}
}