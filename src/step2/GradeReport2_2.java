package step2;

/**
[요구사항] 평균 점수에 따라 A ~ F 까지 등급을 부여하는
프로그램을 작성해 주시오.
100 ~ 90 A
89 ~ 80 B
79 ~ 70 C
69 ~ 60 D
59 ~ 50 E
49 ~ 0 F
화면 출력은 다음과 같습니다.
********************************
| 이름 | 총점 | 평균 등급 |
--------------------------------
| 홍길동 | 270 | 90 | A |
 * */
import java.util.Scanner;
public class GradeReport2_2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		String[] point = new String[3];
		String[] subj = new subj[3];
		subj[0] = "국어";subj[1] = "영어";subj[2] = "수학";
		while(true) {
			System.out.println("0.정지 1.실행");
			switch(s.next()) {
			case "0" : return;
			case "1" : 
				System.out.println("이름은?");
				name = s.next();
				for(i=0;i<point.length;i++) {
					System.out.println(sunj[i]+"점수는?");
					if(Integer.parseInt(point[i])<=100 && Integer.parseInt(point[i])>=0) {
						
					}else {
						
					}
					
				}
				
				System.out.println("국어점수는?");
				point[0] = s.next();
				System.out.println("영어점수는?");
				point[1] = s.next();
				System.out.println("수학점수는?");
				point[2] = s.next();
				
				
				
				break;
			default : System.out.println("ERROR"); return;
			
			}
		}
		
		
	}
}