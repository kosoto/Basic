package projectEuler;
import java.math.BigInteger;
/**
 * (a − 1)^n + (a + 1)^n 을 a^2으로 나누었을 때, 그 나머지를 r이라고 합시다.
예를 들어 a = 7 이고 n = 3 이라면, 63 + 83 = 728 ≡ 42 mod 49 이므로 r = 42입니다. 
  (역주: a ≡ b mod n 이라는 표기법은 a와 b를 각각 n으로 나눌 때 나머지가 같다는 뜻으로 보시면 됩니다) 
n이 바뀌면 r도 달라지겠지만, a = 7 일때 r의 최대값은 rmax = 42 임이 알려져 있습니다.
3 ≤ a ≤ 1000 이라고 할 때, ∑ rmax는 얼마입니까?*/
//???답이 안나와
public class problem120 {
	public static void main(String[] args) {
		int temp =0;
		int r=0;
		int rMax = 0;
		int sumOfrMax = 0;
		for(int a=3;a<=1000;a++) {
			rMax=0;
			for(int n=1;n<1000000;n++) {
				temp=(int)Math.pow(a-1, n)+(int)Math.pow(a+1, n);
				r=temp%(a*a);
				rMax = (rMax<=r)?r:rMax;
			}
			System.out.printf("%d : %d\n",a,rMax);
			sumOfrMax+=rMax;
		}
		System.out.println(sumOfrMax);
	}
}
