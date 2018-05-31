package step2;

/**
 * [수열002] 1-2+3-4+5-6.....-100 = -50 합계(스캐너 없음)
 */
public class Seq011_2 {
	public static void main(String[] args) {
		String result = "";
		int sum = 0;
		int rem = 0;
		for (int i = 1; i <= 100; i++) {
			if (i != 100) {
				rem = i % 2;
				switch (rem) {
				case 0:
					result += i + "+";
					sum -= i;
					break;
				case 1:
					result += i + "-";
					sum += i;
					break;
				default:
					break;
				}
			} else {
				result += "100" + "=";
				sum -= 100;
			}
		}
		System.out.println(result + sum);
	}
}
