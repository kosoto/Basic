package step1;
import java.util.Scanner;
public class Howmuch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("0.종료 1.실행");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 :
				System.out.println("얼마에요?");
				int num1 = scan.nextInt();
				System.out.println(num1 + "원입니다.");

				System.out.println("몇개 드릴까요?");
				int num2 = scan.nextInt();
				System.out.println(num2 + "개 주세요.");

				int num3 = num1 * num2;
				System.out.println("총 금액은 " + num3 + "원 입니다.");

				System.out.println("비싸요 깍아주세요.");
				System.out.println("몇 퍼센트 DC 할까요?");
				
				int dc = scan.nextInt();
				String ans = "안 팔아요.";
				int num4 = num3 * (100 - dc) /100;
				if(dc<10){
					ans = num4 + "원 입니다.";
				}
				System.out.println(ans);
			break;
			default : System.out.print("ERROR");
			}
		}
	}
}
