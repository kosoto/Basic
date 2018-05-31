package step2;

/**
 * 항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음) 1+2+4+7+11+16+22+...순서로 나열되는 수열의 20번째
 * 항까지의 합계
 */
public class Seq013 {
	public static void main(String[] args) {
		int diff = 1;
		int term = 1;
		int sum = 0;
		String result = "";
		for (int i = 1; i <= 20; i++) {
			if (i < 20) {
				result += term + "+";
				sum += term;
				term += diff;
				diff = i + 1;
			} else {
				result += term + "=";
				sum += term;
			}
		}
		System.out.println(result + sum);
	}
}
