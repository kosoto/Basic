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

public class GradeReport2_2 {
	public static int[] input() {
		int[] result = main(scan);
	
		return result;
	}
	public static String[] getGrade(Scanner scan) {
		String[] str = new String[3];
		String[] result1 = new String[3];
		String s = input(scan);
		str =s.split(",");
		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[1]);
		int num3 = Integer.parseInt(str[2]);
		result1[0] = String.valueOf(num1+num2+num3);
        result1[1] = String.valueOf((num1+num2+num3)/3);
		String result = "";
		if (num1 > 100 || num2 > 100 || num3 > 100) {
			result = "잘못된 점수를 입력하였습니다.";
		}
		//int num4 = result1[0] / 3;
		String grade = "F";
		if (Integer.parseInt(result1[1]) >= 90) {
			grade = "A";
		} else if (Integer.parseInt(result1[1]) >= 80) {
			grade = "B";
		} else if (Integer.parseInt(result1[1]) >= 70) {
			grade = "C";
		} else if (Integer.parseInt(result1[1]) >= 60) {
			grade = "D";
		} else if (Integer.parseInt(result1[1]) > 50) {
			grade = "E";
		}
		result1[2] = grade;
		/*if (!result.equals("잘못된 점수를 입력하였습니다.")) {
			result = "| " + name + " |  " + sum + "  |  " + num4 + "  |  " + grade + " |";*/
		return result1;
		}
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, sum =0;
		String grade = "";
		String result = "";
		while (true) {
			System.out.println("0.정지 1.실행");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("이름을 입력하세요.");
				String name = scan.next();
				int[] point =  new int[3];
				System.out.println("국어 점수를 입력하세요.");
				point[0]= scan.nextInt();

				System.out.println("영어 점수를 입력하세요.");
				point[1]= scan.nextInt();

				System.out.println("수학 점수를 입력하세요.");
				point[2]= scan.nextInt();
				////////
				String[] arr =getGrade(scan);
				if (!result.equals("잘못된 점수를 입력하였습니다.")) {
					result = "| " + name + " |  " + sum + "  |  " + num4 + "  |  " + grade + " |";
				}
				System.out.printf("****************************\n");
				System.out.printf("|  이름  |  총점   |  평균  | 등급 |\n");
				System.out.printf("----------------------------\n");
				//System.out.println(result);
				System.out.printf("|  %s  |  %s   |  %s  | %s |\n",name,arr[0],arr[1],arr[2]);
				System.out.println("****************************");
				result = "";
				break;
			default:
				break;
			}
		}
	}
}