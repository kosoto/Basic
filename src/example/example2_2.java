package example;
import java.util.Scanner;
public class example2_2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("첫번째 계산할 값을 입력하세요 ==>");
	int num1 = s.nextInt();
	System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==>");
	int opcode = s.nextInt();
	System.out.print("두번째 계산할 값을 입력하세요 ==>");
	int num2 = s.nextInt();
	int result =0;
	String op = "";
	if(opcode==1) {
		result = num1+num2; 
		op = "+";
	}else if(opcode==2) {
		result = num1-num2;
		op = "-";
	}else if(opcode==3) {
		result = num1*num2;
		op = "*";
	}else if(opcode==4){
		result = num1/num2;
		op = "/";
	} 
	System.out.println(num1+op+num2+"="+result);
}
}
