package step2;

/**
 * To. 개발자님
연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
예시) 2000년 과 2016 년을 입력하면 윤년으로 나옴
*/
//method 나누기 완료
import java.util.Scanner;

public class LeapYear {
	public static String year(String year) {
		String result = "";
		if (Integer.parseInt(year) % 4 == 0 && Integer.parseInt(year) % 100 != 0 && Integer.parseInt(year) % 400 == 0) {
			result = "윤년입니다.";
		} else {
			result = "평년입니다.";
		}
		return result;
	}

	public static boolean check(String year) {
		boolean flag = true;
		for (int i = 0; i < year.length(); i++) {
			if (year.charAt(i) < 48 || year.charAt(i) > 57) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] years = new String[2];
		String temp = "";
		while (true) {
			System.out.print("0.정지, 1.실행");
			switch (scan.next()) {
			case "0":
				System.out.print("종료합니다.");
				return;
			case "1":

				for (int i = 0; i < 1; i++) {
					System.out.print("년도를 입력하세요.");
					temp = scan.next();
					if (check(temp)) {
						years[0] = temp;
					} else {
						i--;
					}
				}

				years[1] = year(years[0]);

				System.out.printf("%s은 %s\n", years[0], years[1]);
				break;
			default:
				System.out.println("ERROR");
				return;
			}
		}
	}
}
