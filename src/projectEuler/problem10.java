package projectEuler;
import java.math.BigInteger;
//200백만 이하의 모든 소수들의 합
public class problem10 {
	public static boolean checkPrime(int n) {
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag = false; break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		BigInteger sumOfPrimes = new BigInteger("0");
		int count =0;
		for(int n=2;n<=2000000;n++) {
			if(checkPrime(n)) {
				sumOfPrimes=sumOfPrimes.add(BigInteger.valueOf(n));
			}
		}
		System.out.println(sumOfPrimes);
	}
}
