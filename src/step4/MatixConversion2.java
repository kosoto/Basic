package step4;
import javax.swing.JOptionPane;

public class MatixConversion2 {
	enum Butt{
		EXIT,
		SWITCHING
	}
	public static void main(String[] args) {
		Butt[] buttons = {
			Butt.EXIT,
			Butt.SWITCHING
		};
		String result = "";
		int[][] mtxA= new int[5][3];
		int[][] mtxB= new int[3][5];
		int count=0;
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,
					"SWITCH PAGE",
					"SELECT SWITCH MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					buttons[1]
					);
			switch(select) {
			case EXIT : return;
			case SWITCHING : 
				for(int i=0;i<5;i++) {
					for(int j=0;j<3;j++) {
						count++;
						mtxA[i][j]=count;
					}
				}
				for(int i=0;i<3;i++) {
					for(int j=0;j<5;j++) {
						mtxB[i][j]=mtxA[i+(2*i+j)/3][(2*i+j)%3];
					}
				}
				for(int i=0;i<3;i++){
					for(int j=0;j<5;j++) {
						result += mtxB[i][j]+"  ";
					}
					result += "\n";
				}
				JOptionPane.showMessageDialog(null, result);
				
				break;
			
			}
			
			
		}

	}
}
