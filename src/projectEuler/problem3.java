package projectEuler;
/**
 * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 * */
//10분이상 돌아감 안좋은 코딩
public class problem3 {
public static void main(String[] args) {
	long n = 600851475143L;
	long result = n,temp =0;
	for(int j=0;n!=1;j++) {
		temp=result;
		for(long i=1l; i<=n/3;i++) {
			
			result=(n%i==0l)?i:result;
		}
		n=result;
	}
	System.out.println(temp);
}
}
