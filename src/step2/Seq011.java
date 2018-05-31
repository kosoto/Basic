package step2;

/**
 * [수열002] 1-2+3-4+5-6.....-100 = -50 합계(스캐너 없음)
 */
public class Seq011 {
	public static void main(String[] args) {
		String result = "";
		int sum = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 0) {
				result += i + "+";
				sum -= i;
			} else {
				result += i + "-";
				sum += i;
			}
		}
		result += "100" + "=";
		sum -= 100;
		System.out.println(result + sum);
	}
}
