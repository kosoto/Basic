package step5;
import javax.swing.JOptionPane;

public class Salary {
	enum Butt{
		EXIT,
		INPUT,
		LIST
	}
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.INPUT,
				Butt.LIST
				
		};
		String result = "부서 | 성명 | 본봉 | 수당 | 합계\n";
		String[][] mtx = new String[10][5];
		int sumTotal = 0;
		int sumDepartSales = 0;
		int sumDepartGeneral = 0;
		int i = 0;
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,  //frame
					"SALARY PAGE", //frame title
					"SELECT SALARY MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, //icon
					buttons, //Array of choices
					buttons[1] // default
					);
			String[] list = {"부서","성명","본봉","수당"};
			switch(select) {
			case EXIT: return;
			case INPUT: 
				for(int j=0;j<4;j++) {
					mtx[i][j]=JOptionPane.showInputDialog(list[j]);
				}
				mtx[i][4]=String.valueOf(Integer.parseInt(mtx[i][2])+Integer.parseInt(mtx[i][3]));
				sumTotal+=Integer.parseInt(mtx[i][4]);
				switch(mtx[i][0]) {
				case "영업" :
					sumDepartSales +=Integer.parseInt(mtx[i][4]);
					break;
				case "총무" :
					sumDepartGeneral +=Integer.parseInt(mtx[i][4]);
					break;
				default : break;
				}
				for(int j=0;j<5;j++) {
					result+=mtx[i][j]+" ";
				}
				result +="\n";
				i++;
				break;
			case LIST: 
				JOptionPane.showMessageDialog(null, result);
				break;
			default : return;
			
			}
			
			
	

			
			
			
		}
	}

}
