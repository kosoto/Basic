package projectEuler;
//1부터 100가지의 "제곱의합" 과 " 합의 제곱" 의 차는?
public class problem6 {
public static void main(String[] args) {
	int sumOfSquare =0;
	int squareOfSum =0;
	int result = 0;
	for(int i=1;i<101;i++) {
		squareOfSum+=i;
	}
	squareOfSum*=squareOfSum;
	for(int i=1;i<101;i++) {
		sumOfSquare+=(i*i);
	}
	result = squareOfSum-sumOfSquare;
	System.out.println(result);
}
}
