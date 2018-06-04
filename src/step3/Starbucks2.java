package step3;

/**
 * 스타벅스 커피주문 프로그램
 */
import javax.swing.JOptionPane;

public class Starbucks2 {
	public static boolean check1(String temp) {
		boolean result = false;
		if (Integer.parseInt(temp) >= 1) {
			result = true;
		}
		return result;
	}

	public static boolean check(String temp) {
		boolean result = true;
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) < 48 || temp.charAt(i) > 57) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static String[] value(String[] drink) {
		
		/*int[] prices = {3000, 3500, 4000};
		for(int i=0;i<prices.length;i++) {
			drink[2] = String.valueOf(Integer.parseInt(drink[2]) + Integer.parseInt(drink[1]) * prices[i]) ;
		}*/
		
		switch (drink[0]) {
		case "1":
			drink[2] = String.valueOf(Integer.parseInt(drink[2]) + Integer.parseInt(drink[1]) * 3000);
			break;
		case "2":
			drink[2] = String.valueOf(Integer.parseInt(drink[2]) + Integer.parseInt(drink[1]) * 3500);
			break;
		case "3":
			drink[2] = String.valueOf(Integer.parseInt(drink[2]) + Integer.parseInt(drink[1]) * 4000);
			break;
		}
		return drink;
	}

	public static void main(String[] args) {

		String[] drink = { "", "", "0" };
		String temp,result = "";
		String[] coffee = {"아메리카노","라떼","카푸치노"};
		while (true) {

			drink[0] = JOptionPane.showInputDialog("0.주문완료\n1.아메리카노:3000\n2.라떼:3500\n3.카푸치노:4000\n");

			//JOptionPane.showMessageDialog(null, drink[0] + "를 선택");

			switch (drink[0]) {
			case "0":
				if (drink[2].equals("0")) {
					JOptionPane.showMessageDialog(null, "종료합니다.");
				} else {
					JOptionPane.showMessageDialog(null, "결재금액이 총 " + drink[2] + "입니다.");
				}
				return;
			case "1":
			case "2":
			case "3":
				switch(drink[0]) {
				case "1" : result = coffee[0]; break;
				case "2" : result = coffee[1]; break;
				case "3" : result = coffee[2]; break;
				}
				JOptionPane.showMessageDialog(null, result + "를 선택");
				
				for (int i = 0; i < 1; i++) {
					temp = JOptionPane.showInputDialog(null, "몇잔 드릴까요?");
					if (check(temp) && check1(temp)) {
						drink[1] = temp;
					} else {
						JOptionPane.showMessageDialog(null, "잘못 입력했습니다.");
						i--;
					}
				}
				drink = value(drink);
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못 입력했습니다.");
				break;
			}
		}
	}
}
