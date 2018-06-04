package step2;

/**
 * 달을 입력하면 말일을 출력
 * */
//method 나누기 완료
import java.util.Scanner;

public class MonthEndday {
	public static boolean check(String month) {
		boolean result = true;
		for (int i = 0; i < month.length(); i++) {
			if (month.charAt(i) < 48 || month.charAt(i) > 57) {
				result = false;
				break;
			}

		}

		return result;
	}

	public static boolean check2(String month) {
		return (Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12);
	}

	public static String endday(String month) {
		String end = "";
		switch (month) {
		case "4":
		case "6":
		case "9":
		case "11":
			end = "30";
			break;
		case "2":
			end = "28";
			break;
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
			end = "31";
			break;
		}
		return end;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] result = new String[2];
		String end, month = " ";
		String temp = "";
		while (true) {
			System.out.print("0.정지, 1.실행");
			switch (scan.nextInt()) {
			case 0:
				System.out.print("종료합니다.");
				return;
			case 1:

				for (int i = 0; i < 1; i++) {
					System.out.print("월을  입력하세요.");
					temp = scan.next();
					if (!check(temp)) {
						System.out.println("잘못 입력");
						i--;
					} else {
						if (check2(temp)) {
							result[0] = temp;
						} else {
							System.out.println("잘못 입력");
							i--;
						}
					}
				}

				result[1] = endday(result[0]);

				System.out.printf("%s월의 말일은 %s월%s일입니다.\n", result[0], result[0], result[1]);
				break;
			default:
				System.out.println("ERROR");
				return;
			}
		}
	}

}
