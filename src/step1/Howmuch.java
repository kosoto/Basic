package step1;
/**
"얼마에요?
100
100원 입니다.
몇개 드릴까요?
5
5개 주세요
총 금액은 500원 입니다
비싸요, 10% 깎아주세요.
int dc = total / 10;
total = total - dc;
그럼 450원만 주세요"
*/
import java.util.Scanner;

public class Howmuch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, dc, num4 = 0;
		String ans = "";
		while (true) {
			System.out.print("0.종료 1.실행");
			switch (scan.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("얼마에요?");
				num1 = scan.nextInt();
				System.out.println(num1 + "원입니다.");

				System.out.println("몇개 드릴까요?");
				num2 = scan.nextInt();
				System.out.println(num2 + "개 주세요.");

				num3 = num1 * num2;
				System.out.println("총 금액은 " + num3 + "원 입니다.");

				System.out.println("비싸요 깍아주세요.");
				System.out.println("몇 퍼센트 DC 할까요?");

				dc = scan.nextInt();
				num4 = num3 * (100 - dc) / 100;

				ans = (dc < 10) ? num4 + "원 입니다." : "안 팔아요.";
				System.out.println(ans);
				break;
			default:
				System.out.print("ERROR");
			}
		}
	}
}
