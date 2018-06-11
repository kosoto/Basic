package example;
import java.util.Scanner;
public class example4_8 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요 ==> ");
		double num1= s.nextDouble();
		System.out.println("두번째 계산할 값을 입력하세요 ==> ");
		double num2= s.nextDouble();
		System.out.printf("%f + %f = %f\n",num1,num2,num1+num2);
		System.out.printf("%f - %f = %f\n",num1,num2,num1-num2);
		System.out.printf("%f * %f = %f\n",num1,num2,num1*num2);
		System.out.printf("%f / %f = %f\n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d\n",(int)num1,(int)num2,(int)num1%(int)num2);
	}
}
