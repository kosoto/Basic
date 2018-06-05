package step3;
import javax.swing.JOptionPane;
public class ArrayTest {
	public static String getGrade(double aver) {
		String grade = "";
		int flag = (int)(aver/10);
		switch(flag) {
		case 10 : case 9 : grade = "A";	break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		case 5 : grade = "E"; break;
		}
		return grade;
	}
	public static double getAver(int total) {
		return total/3;
	}
	public static int getTotal(String[] arr) {
		return Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
	}
	public static void main(String[] args) {
		String score = "";
		String grade = "";
		String names = "";
		String totals = "";
		String[] results = new String[10];
		results[0] = "이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 학점 \n";
		int rank = 0;
		int count = 1;
		int[] ranks = new int[10];
		int length = 0;
		int total = 0;
		double aver = 0;
		String[] ranking = new String[10];
		ranking[0] = "이름 | 순위\n";
		while(true) {
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.순위출력 3.전체보기");
			switch(menu) {
			case "0" : return;
			case "1" : 
				score = JOptionPane.showInputDialog("이름/국어/영어/수학");
				String[] arr = score.split("/");
				names += arr[0]+"/";
				total = getTotal(arr);
				totals += String.valueOf(total)+"/";
				aver = getAver(total);
				grade = getGrade(aver);
				results[count] = arr[0] + " | "+ arr[1] +" | "+ arr[2] +" | "+ arr[3] +" | "+ total +" | "+ aver +" | "+ grade +"\n";
				count++;
				break;
			case "2" : 
				String[] arrName = names.split("/");
				String[] arrTotal = totals.split("/");
				//JOptionPane.showMessageDialog(null, arrTotal);
				length = arrTotal.length;
				rank = 1;
				for(int i=0;i<length;i++) {
					for(int j=0;j<length && (j!=i);j++) {
						if(Integer.parseInt(arrTotal[i])<Integer.parseInt(arrTotal[j])) {
							rank++;
						}
					}
					ranks[i] = rank;
					ranking[i+1] =   arrName[i]+" | " +ranks[i]+"\n";
				}
				JOptionPane.showMessageDialog(null, ranking);
				break;
			case "3" : 
				JOptionPane.showMessageDialog(null,results);
				break;
			
			default : return;
			
			
			}
						
		}

	}

}
