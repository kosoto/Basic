package step1;

/**
 * 값을 두개 입력받아서 오칙연산(+,-,*,/,%)
 * */
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		String result = "";
		while (true) {
			System.out.print("0.정지 1.실행");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("첫번째 수를 입력하세요.");
				num1 = scan.nextInt();
				System.out.println("연산기호를 입력하세요.");
				String opcode = scan.next();
				System.out.println("두번째 수를 입력하세요.");
				num2 = scan.nextInt();
				switch (opcode) {
				case "+":
					num3 = num1 + num2;
					break;
				case "-":
					num3 = num1 - num2;
					break;
				case "*":
					num3 = num1 * num2;
					break;
				case "/":
					num3 = num1 / num2;
					break;
				case "%":
					num3 = num1 % num2;
					break;
				default:
					result = "잘못된 연산기호를 입력하였습니다.";
					break;
				}

				if (!result.equals("잘못된 연산기호를 입력하였습니다.")) {
					result = num1 + " " + opcode + " " + num2 + " = " + num3;
				}
				System.out.println(result);
				result = "";
				break;
			default:
				System.out.println("ERROR");
				return;
			}
		}
	}
}
