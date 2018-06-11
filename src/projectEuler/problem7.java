package projectEuler;
//10001번째 소수 구하기
public class problem7 {
	public static boolean checkPrime(int i) {
		boolean flag = true;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag = false; break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
	int count = 1;
	int result =0;
	for(int i=3;count<10001;i++) {
		if(checkPrime(i)) {
			result=i;
			count++;
		}
	}
	System.out.println(result);
	}
}
