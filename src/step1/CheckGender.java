package step1;
import java.util.Scanner;
public class CheckGender {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.print("0.정지, 1.실행");
			int flag = scan.nextInt();
			switch(flag){
				case 0 : System.out.print("종료합니다."); return;
				case 1 : 
					System.out.println("이름을 입력하세요.");
					String name = scan.next();

					System.out.println("주민번호를 입력하세요.");
					String num = scan.next();
					char ch = num.charAt(7);
					String result = "다시 입력하세요.";

					switch(ch){
						case '1' : case '3' : result = "남"; break;
						case '2' : case '4' : result = "녀"; break;
						case '5' : case '6' : result = "외국인"; break;
					}
					
					String result1 = "";
					if(!result.equals("다시 입력하세요.")){
						result1 = name +" : "+num +" : "+result ;
					}else{
						result1 = result;
					}
					System.out.println(result1);
				break;
			}
		}
	}

}
