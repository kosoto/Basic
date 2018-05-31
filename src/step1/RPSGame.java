package step1;
/**
 * 가위바위보
 * */
import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행");
			switch(scan.nextInt()) {
			case 0 : System.out.print("종료합니다."); return;
			case 1 : 
				System.out.println("player1 은 가위 바위 보 중에 하나를 내세요. ");
				String player1 = scan.next();
				int num1 = 0;
				switch(player1){
					case "가위" : num1 = 2; break;
					case "바위" : num1 = 0; break;
					case "보" : num1 = 5;
				}
				System.out.println("player2 는 가위 바위 보 중에 하나를 내세요. ");
				String player2 = scan.next();
				int num2 = 0;
				switch(player2){
					case "가위" : num2 = 2; break;
					case "바위" : num2 = 0; break;
					case "보" : num2 = 5;
				String result = "";
				int ref = num1 - num2;
				switch(ref){
					case 2 : case -5 : case 3 : result = "player2가 이겼습니다."; break;
					case -3 : case -2 : case 5 : result = "player1이 이겼습니다."; break;
					case 0 : result = "비겼습니다.";
				}
				System.out.print(result);
			break;
			default : System.out.print("ERROR");
				}
			}
		}
	}
}