package step1;
import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.next();

		System.out.println("국어 점수를 입력하세요.");
		int num1 = scan.nextInt();
				
		System.out.println("영어 점수를 입력하세요.");
		int num2 = scan.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");
		int num3 = scan.nextInt();
		
		String result = "";
		if(num1>100 || num2>100 || num3>100){
			result = "잘못된 점수를 입력하였습니다.";
		}

		int num4 = (num1 + num2 + num3) / 3;
		String grade = "F";
		if(num4>=90){
			grade = "A";
		}else if(num4>=80){
			grade = "B";
		}else if(num4>=70){
			grade = "C";
		}else if(num4>=60){
			grade = "D";
		}else if(num4>50){
			grade = "E";
		}
		
		if(!result.equals("잘못된 점수를 입력하였습니다.")){
			result = name + "님의 평균은 " + num4 +"점,"+ " 학점은 " + grade + "입니다." ;
		}
		System.out.println(result);
	}
}