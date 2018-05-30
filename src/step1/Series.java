package step1;
import java.util.Scanner;
public class Series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.정지 1.실행");
			switch(scan.nextInt()){
				case 0 : System.out.print("종료합니다.");return;
				case 1 : 
				System.out.println("두 정수를 입력하세요.");
				int num1 = scan.nextInt(), num2 = scan.nextInt(), start = num1, end = num2, sum = 0;
				String result = "";
				if(num1>num2){
					start = num2;
					end = num1;
				}
				for(int i = start; i < end; i++){
					result += i + " + ";
					sum += i;
				}
				sum += end;
				result = result + end +" = "+ sum;

				System.out.println(result);
				break;
				default : break;
			}
		}
	}

}
