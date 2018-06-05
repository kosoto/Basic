package step3;

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
//method 나누기 완료
public class GradeReport2_2 {
	public static String[] getTotal(String[] point) {
		String[] result = new String[10];
		result[0] = String
				.valueOf(Integer.parseInt(point[0]) + Integer.parseInt(point[1]) + Integer.parseInt(point[2]));
		result[1] = String.valueOf(Integer.parseInt(result[0]) / 3);
		return result;
	}

	public static String[] getGrade(String[] parms) {
		String[] result = new String[3];
		result[0] = parms[0];
		result[1] = parms[1];
		switch (Integer.parseInt(result[1]) / 10) {
		case 10:
		case 9:
			result[2] = "A";
			break;
		case 8:
			result[2] = "B";
			break;
		case 7:
			result[2] = "C";
			break;
		case 6:
			result[2] = "D";
			break;
		case 5:
			result[2] = "E";
			break;
		default:
			result[2] = "F";
			break;
		}
		return result;
	}

	public static boolean input(int param) {
		return (param <= 100 && param >= 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] subj = { "국어", "수학", "영어" };
		String name = "";
		String[] result = new String[3];
		while (true) {
			System.out.println("0.정지 1.실행");
			switch (s.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("이름은?");
				name = s.next();
				String[] point = new String[3];
				for (int i = 0; i < point.length; i++) {
					System.out.println(subj[i] + "점수는?");
					int temp = Integer.parseInt(s.next());
					if (input(temp)) {
						point[i] = String.valueOf(temp);
					} else {
						System.out.println("다시 입력");
						i--;
					}
				}
				String arr[] = getGrade(getTotal(point));
				System.out.printf("************************************\n");
				System.out.printf("| 이름  |  총점     |  평균    | 등급  |\n");
				System.out.printf("-------------------------------------\n");
				System.out.printf("| %s | %s | %s | %s |\n", name, arr[0], arr[1], arr[2]);
				System.out.print("************************************\n");
				break;
			default:
				return;
			}
		}
	}
}