package example;
import java.util.Scanner;
public class example2_3 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("첫번째 계산할 값을 입력하세요 ==>");
	int num1 = s.nextInt();
	System.out.print("+ - * / % ==>");
	String opcode = s.next();
	System.out.print("두번째 계산할 값을 입력하세요 ==>");
	int num2 = s.nextInt();
	int result =0;
	String result2="";
	switch(opcode) {
	case "+": 
		result = num1+num2; 
		result2 =num1+opcode+num2+"="+result;
		break;
	case "-":
		result = num1-num2;
		result2 =num1+opcode+num2+"="+result;break;
	case "*": 
		result = num1*num2;
		result2 =num1+opcode+num2+"="+result;break;
	case "/":
		if(num2!=0) {
			result = num1/num2;
			result2 =num1+opcode+num2+"="+result;
		}else {
			result2 = "0으로 나누면 안됩니다.";
		}
		break;
	case "%": 
		result = num1%num2;
		result2 =num1+opcode+num2+"="+result;break;
	}
	System.out.println(result2);
}
}
