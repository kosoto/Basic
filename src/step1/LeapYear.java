package step1;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("0.정지, 1.실행");
			int flag = scan.nextInt();
			switch(flag){
				case 0 : System.out.print("종료합니다."); return;
				case 1 : 
				System.out.print("년도를 네자리수로 입력하세요.");
				int year = scan.nextInt(), rem4 = year%4 , rem100 = year%100, rem400 = year%400;
				String result = "평년입니다.";
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
