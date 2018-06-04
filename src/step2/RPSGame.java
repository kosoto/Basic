package step2;

/**
 * 가위바위보
 * */
import java.util.Scanner;
//method 나누기 완료
public class RPSGame {
	public static boolean input(String finger) {

		return (finger.equals("가위") || finger.equals("바위") || finger.equals("보"));
	}

	public static String ref(String[] parms) {
		String result = "";
		int ref = Integer.parseInt(parms[0]) - Integer.parseInt(parms[1]);
		switch (ref) {
		case 2:
		case -5:
		case 3:
			result = "player2가 이겼습니다.";
			break;
		case -3:
		case -2:
		case 5:
			result = "player1이 이겼습니다.";
			break;
		case 0:
			result = "비겼습니다.";
		default : break;
		}
		return result;

	}

	public static String[] num(String[] fingers) {
		String[] parms = new String[2];
		for (int i = 0; i <= 1; i++) {
			switch (fingers[i]) {
			case "가위":
				parms[i] = "2";
				break;
			case "바위":
				parms[i] = "0";
				break;
			case "보":
				parms[i] = "5";
				break;
			}
		}
		return parms;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = "";
		String[] players = { "player1", "player2" };
		String[] fingers = new String[2];
		while (true) {
			System.out.print("0.종료 1.실행");
			switch (scan.next()) {
			case "0":
				System.out.print("종료합니다.");
				return;
			case "1":
				for (int i = 0; i < players.length; i++) {
					System.out.println(players[i] + "은(는) 가위 바위 보 중 하나를 선택하세요.");
					temp = scan.next();
					if (input(temp)) {
						fingers[i] = temp;
					} else {
						i--;
					}
				}

				String result = ref(num(fingers));

				System.out.println(result);
				break;
			default:
				System.out.println("ERROR");
				return;
			}
		}
	}
}
