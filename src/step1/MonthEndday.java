package step1;
import java.util.Scanner;
public class MonthEndday {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month,end,result = "";
		while(true){
			System.out.print("0.정지, 1.실행");
			switch(scan.nextInt()){
				case 0 : System.out.print("종료합니다."); return;
				case 1 : 
				end = "잘못 입력하였습니다.";
				System.out.print("월을 숫자로 입력하세요.");
				month = scan.next();
				switch(month){
					case "4" : case "6" : case "9" : case "11" : end = "30"; break;
					case "2" : end = "28"; break;
					case "1" : case "3" : case "5" : case "7" : case "8" : case "10" : case "12" : end = "31"; break;
				}
				if (!end.equals("잘못 입력하였습니다.")){
					result = "말일이 " + month + "월" + end + "일입니다.";
				}else{
					result = end;
				}
				System.out.println(result); 
				break;
				default : break;
			}
		}
	}

}
