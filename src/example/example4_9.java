package example;
import java.util.Scanner;
public class example4_9 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("## 교환할 돈은 ?");
	int num = s.nextInt();
	System.out.printf("\n 오백원짜리 ==> %d\n",num/500);
	num %=500;
	System.out.printf(" 백원짜리 ==> %d\n",num/100);
	num %=100;
	System.out.printf("오십원짜리 ==> %d\n",num/50);
	num %=50;
	System.out.printf(" 십원짜리 ==> %d\n",num/10);
	num%=10;
	System.out.printf("바꾸지 못한 잔돈 ==> %d",num);
	
}
}
