package step1;
/**
 * To. 개발자님
연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
예시) 2000년 과 2016 년을 입력하면 윤년으로 나옴
*/
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int year = 0, rem4 = 0 , rem100 = 0, rem400 = 0;
		String result = "";
		while(true){
			System.out.print("0.정지, 1.실행");
			switch(scan.nextInt()){
				case 0 : System.out.print("종료합니다."); return;
				case 1 : 
				System.out.print("년도를 네자리수로 입력하세요.");
				year = scan.nextInt(); rem4 = year%4; rem100 = year%100; rem400 = year%400;
				result = "평년입니다.";
				if(
					rem4==0 && rem100!=0
						||
					rem4==0 && rem100==0 && rem400==0
						||
					rem4!=0 && rem400==0){
					result = "윤년입니다.";
				}

				System.out.println(year + "년은 " + result);
				break;
				default : break;
			}
		}
	}
}
