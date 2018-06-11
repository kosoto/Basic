package example;
import java.util.Scanner;
public class example3_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("입력진수 결정<1>10 <2>16 <3>8 : ");
		String flag = s.next();
		System.out.print("값 입력 : ");
		String num = s.next();
		int result =0;
		switch(flag) {
		case "1": 
			result = Integer.parseInt(num,10);
			break;
		case "2":
			result = Integer.parseInt(num,16);break;
		case "3": 
			result = Integer.parseInt(num,8);break;
		}
		System.out.printf("10진수 ==> %d\n",result);
		System.out.printf("16진수 ==> %x\n",result);
		System.out.printf("8진수 ==> %o\n",result);
		
	}
}
