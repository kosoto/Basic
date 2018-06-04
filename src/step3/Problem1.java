package step3;
import javax.swing.JOptionPane;

public class Problem1 {
	public static void main(String[] args) {
		String[] input = new String[2];
		int[] num = new int[10];
		int[] money = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] remainder = new int[10];
		int[] quotient = new int[10];
		int[] totalcount = new int[10];
		while(true) {
			
			
		}
		input[0] = JOptionPane.showInputDialog("이름");
		input[1] = JOptionPane.showInputDialog("출장비 지급액");
		quotient[0] = Integer.parseInt(input[1])/money[0];
		remainder[0] = Integer.parseInt(input[1])%money[0];
		
		for(int i =1; i<10;i++) {
			quotient[i] = remainder[i-1]/money[i];
			remainder[i] = remainder[i-1]%money[i];
			totalcount[i] += quotient[i];
		}
		
		
		
		
		
		
		JOptionPane.showMessageDialog(null, 
				"성명" + "출장비지급액" + "오만" + "오천" + "일천" 
			  + "오백" + "일백" + "오십" + "일십" + "오" + "일");
		JOptionPane.showMessageDialog(null, input[0] + input[1]);
		
		
		
		
	}

}
