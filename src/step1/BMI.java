package step1;

import java.util.Scanner;

/**
 * BMI = 몸무게 / 키² 로서, 여기서 몸무게는 kg, 키는 m 단위이다. 예를 들자면, 몸무게 55kg에 키 1.68m인 사람의
 * BMI는 55kg/(1.68m)^2 = 19.4이다. 2018년 비만진료지침에서 단계별 용어가 새롭게 변경되어 18.5 미만이면 저체중,
 * 18.5∼23은 정상, 23~25이면 '비만 전단계'[5], 25∼30은 '1단계 비만', 30∼35는 '2단계 비만' , 35 이상이면
 * '3단계 비만'으로 구분한다.
 */
public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight = 0.0, height = 0.0, bmi = 0.0;
		String result = "";
		while (true) {
			System.out.print("0.정지, 1.실행");
			switch (scan.nextInt()) {
			case 0:
				System.out.print("종료합니다.");
				return;
			case 1:
				System.out.print("당신의 몸무게는 몇 kg입니까?");
				weight = scan.nextDouble();

				System.out.print("당신의 키는 몇 m입니까?");
				height = scan.nextDouble();

				bmi = weight / (height * height);
				result = "3단계 비만";

				if (bmi < 18.5) {
					result = "저체중";
				} else if (bmi < 23) {
					result = "정상";
				} else if (bmi < 25) {
					result = "비만 전단계";
				} else if (bmi < 30) {
					result = "1단계 비만";
				} else if (bmi < 35) {
					result = "2단계 비만";
				}
				System.out.println("당신은 " + result + "입니다.");
				break;
			default:
				break;
			}
		}
	}
}
