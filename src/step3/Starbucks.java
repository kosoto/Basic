package step3;

import java.util.Scanner;

public class Starbucks {
	public static boolean check1(String temp) {
		boolean result = false;
		if (Integer.parseInt(temp) >= 1) {
			result = true;
		}
		return result;
	}

	public static boolean check(String temp) {
		boolean result = true;
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) < 48 || temp.charAt(i) > 57) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static String[] value(String[] drink) {
		switch (drink[0]) {
		case "1":
			drink[2] = String.valueOf(Integer.parseInt(drink[2]) + Integer.parseInt(drink[1]) * 3000);
			break;
		case "2":
			drink[2] = String.valueOf(Integer.parseInt(drink[2]) + Integer.parseInt(drink[1]) * 3500);
			break;
		case "3":
			drink[2] = String.valueOf(Integer.parseInt(drink[2]) + Integer.parseInt(drink[1]) * 4000);
			break;
		}
		return drink;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] drink = { "", "", "0" };
		String[] coffee = {"아메리카노","라떼","카푸치노"};
		String temp = "";
		while (true) {
			System.out.println("무엇을 드릴까요?");

			System.out.printf("0.종료\n1.%s:&#92 3000\n2.%s:3500\n3.%s:4000\n",coffee[0],coffee[1],coffee[2]);
			drink[0] = s.next();
			switch (drink[0]) {
			case "0":
				if (drink[2].equals("0")) {
					System.out.println("종료합니다.");
				} else {
					System.out.printf("결재금액이 총 %s원 입니다.\n", drink[2]);
				}
				return;
			case "1":
			case "2":
			case "3":
				for (int i = 0; i < 1; i++) {
					System.out.println("몇잔 드릴까요?");
					temp = s.next();
					if (check(temp) && check1(temp)) {
						drink[1] = temp;
					} else {
						i--;
					}
				}
				drink = value(drink);
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}
	}
}
