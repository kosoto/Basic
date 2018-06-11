package projectEuler;
//2~19까지의 수들로 나누어 떨어지는 가장 작은수는?
public class problem5 {

public static void main(String[] args) {
	int result = 0;
	int i = 2;
	while(true) {
		result = (
				i%10==0 && i%11==0 && i%12==0 && i%13==0 && i%14==0 && i%15==0 &&
				i%16==0 && i%17==0 && i%18==0 && i%19==0
				)? i:result;
		i++;
		if(result!=0) {
			System.out.println(result);return;
		}
	}
}
}
