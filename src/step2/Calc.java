package step2;

/**
 * 값을 두개 입력받아서 오칙연산(+,-,*,/,%)
 * */
import java.util.Scanner;
//method 나누기 완료
public class Calc {
	public static boolean integer(String num) {
		return ((Double.parseDouble(num) - (int) (Double.parseDouble(num))) == 0);
	}

	public static boolean opcode(String opcode) {

		return (opcode.equals("+") || opcode.equals("-") || opcode.equals("*") || opcode.equals("/")
				|| opcode.equals("%"));
	}

	public static String[] calc(String[] calc) {
		String[] result = { calc[0], calc[1], calc[2], " " };
		switch (result[1]) {
		case "+":
			result[3] = String.valueOf(Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]));
			break;
		case "-":
			result[3] = String.valueOf(Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]));
			break;
		case "*":
			result[3] = String.valueOf(Integer.parseInt(calc[0]) * Integer.parseInt(calc[2]));
			break;
		case "/":
			result[3] = String.valueOf(Integer.parseInt(calc[0]) / Integer.parseInt(calc[2]));
			break;
		case "%":
			result[3] = String.valueOf(Integer.parseInt(calc[0]) % Integer.parseInt(calc[2]));
			break;
		default:
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opcode = "";
		String[] result = new String[4];
		String[] calc = new String[3];
		String temp = "";
		while (true) {
			//System.out.print("0.정지 1.실행");
			switch (scan.next()) {
			case "0":
				System.out.println("종료합니다.");
				return;
			case "1":

				for (int i = 0; i < 1; i++) {
					System.out.println("첫번째 정수를 입력하세요.");
					temp = scan.next();
					if (integer(temp)) {
						calc[0] = temp;
					} else {
						i--;
					}
				}

				for (int i = 0; i < 1; i++) {
					System.out.println("연산기호를 입력하세요.");
					temp = scan.next();
					if (opcode(temp)) {
						calc[1] = temp;
					} else {
						i--;
					}
				}

				for (int i = 0; i < 1; i++) {
					System.out.println("두번째 정수를 입력하세요.");
					temp = scan.next();
					if (integer(temp)) {
						calc[2] = temp;
					} else {
						i--;
					}
				}

				result = calc(calc);
				System.out.printf("%s %s %s = %s\n", result[0], result[1], result[2], result[3]);
				break;
			default:
				System.out.println("ERROR");
				return;
			}
		}
	}
}
