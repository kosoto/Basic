package example;
import java.util.Scanner;
public class problem4_8 {
public static void main(String[] args) {
	Scanner s  = new Scanner(System.in);
	System.out.print("## 계산 할 초는 ?");
	int time = s.nextInt();
	System.out.printf("\n 시간은 ==> %d 시간\n",time/3600);
	System.out.printf(" 분은   ==> %d 분\n",(time%3600)/60);
	System.out.printf(" 초는   ==> %d 초\n",(time%3600)%60);
	
}
}
