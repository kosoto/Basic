package step4;

import javax.swing.JOptionPane;

public class Matrix {
enum Butt{
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGZAG,
	DIAMOND,
	SAND_GLASS,
	TRIANGLE,
	DIAGONAL,
	SNAIL,
	MAGIC_SQUARE,
	MATRIX_CONVERSION;
}
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.LEFT_TRIANGLE,
				Butt.RIGHT_TRIANGLE,
				Butt.ZIGZAG,
				Butt.DIAMOND,
				Butt.SAND_GLASS,
				Butt.TRIANGLE,
				Butt.DIAGONAL,
				Butt.SNAIL,
				Butt.MAGIC_SQUARE,
				Butt.MATRIX_CONVERSION	
		};
		String result ="";
		String menu = "0.Exit" 
				+"1.LeftTriangle"
				+"2.RightTriangle"
				+"3.Zigzag"
				+"4.Doamond"
				+"5.SandGlass"
				+"6.Triangle"
				+"7.Snail"
				+"8.MagicSquare"
				+"9.Diagonal"
				+"10.MatrixConversion"
				;
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,  //frame
					"MATRIX PAGE", //frame title
					"SELECT MATRIX MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, //icon
					buttons, //Array of choices
					buttons[1] // default
					);
			switch(select) {
			case EXIT: return;
			case LEFT_TRIANGLE: 
				JOptionPane.showMessageDialog(null, leftTriangle());
				break;
			case RIGHT_TRIANGLE: 
				JOptionPane.showMessageDialog(null, rightTriangle());
				break;
			case ZIGZAG: 
				JOptionPane.showMessageDialog(null, zigzag());
				break;
			case DIAMOND: 
				JOptionPane.showMessageDialog(null, diamond());
				break;
			case SAND_GLASS: 
				JOptionPane.showMessageDialog(null, sandGlass());
				break;
			case TRIANGLE: 
				JOptionPane.showMessageDialog(null, triangle());
				break;
			case DIAGONAL: 
				JOptionPane.showMessageDialog(null, diagonal());
				break;
			case SNAIL: 
				JOptionPane.showMessageDialog(null, snail());
				break;
			case MAGIC_SQUARE: 
				JOptionPane.showMessageDialog(null, magicSquare());
				break;
			case MATRIX_CONVERSION: 
				JOptionPane.showMessageDialog(null, matrixConversion());
				break;
			default : return;
			
			}	
			
			
		}
		
		
	}
	public static String leftTriangle() {
		int[][] mtx = new int[5][5];
		String result = "";
		int count = 0;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i + 1; j++) {
				count++;
				mtx[i][j] = count;
			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j]+"  ";
			}
			result +="\n";
		}
		return result;
	}
	public static String rightTriangle() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		for (int i = 0; i <5 ; i++) {

			for (int j = 4-i; j < 5; j++) {
				count++;
				mtx[i][j] = count;
			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j]+"  ";

			}
			result += "\n";
		}
		return result;
	}
	public static String zigzag() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					count++;
					mtx[i][j] = count;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j]+"  ";
			}
			result += "\n";
		}
		return result;
	}
	public static String diamond() {
		String result ="";
		int[][] mtx = new int[5][5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if(i<3) {
				for(int j=2-i;j<3+i;j++) {
					count++;
					mtx[i][j] = count;
				}	
			}else {
				for(int j=i-2;j<=6-i;j++) {
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += mtx[i][j] +"  ";
			}
			result+="\n";
		}
		return result;
	}
	public static String sandGlass() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if(i<3) {
				for (int j = 0+i; j < 5-i; j++) {
					count++;
					mtx[i][j] = count;
				}
			}else {
				for (int j = 4-i; j < i+1; j++) {
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j] +"  ";
			}
			result += "\n";
		}
		return result;
	}
	public static String triangle() {
		String result = "";
		int[][] mtx = new int[7][4];
		int count = 0;
		for (int i = 0; i < 4; i++) {

			for (int j = 3-i; j <= 3+i; j++) {
				count++;
				mtx[j][i] = count;
			}
		}
		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 4; j++) {
				result += mtx[i][j]+"  ";
			}
			result +="\n";
		}
		return result;
	}
	public static String diagonal() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		int row=0,column=0;
		for(int k=0;k<=8;k++) {
			if(k<=4) {
				for(int i=0;i<=k;i++) {
					count++;
					mtx[row+i][column-i]=count;
				}	
				column++;
			}else {
				for(int i=0;i<=8-k;i++) {
					count++;
					mtx[row+i+1][column-1-i]=count;
				}
				row++;
			}
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j] +"  ";
			}
			result += "\n";
		}
		return result;
	}
	public static String snail() {
		String result = "";
		int[][] mtx = new int[5][5];
		int rotation = 5, sign = 1, row = 0, column=-1, count=1;
		for(int k=0;k<5;k++) {
			for(int i=0;i<rotation;i++) {
				column+=sign;
				mtx[row][column]=count++;
			}
			rotation--;
			for(int j=0;j<rotation;j++) {
				row+=sign;
				mtx[row][column]=count++;
			}
			sign*=-1;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += mtx[i][j]+"  ";
			}
			result += "\n";
		}
		return result;
	}
	public static String magicSquare() {
		String result = "";
		int[][] mtx = new int[5][5];
		int count = 0;
		int row = 0;
		int column = 2;
		for(int k=0;k<5;k++) {
			for(int i=0;i<5;i++) {
				count++;
				mtx[(row-i+5)%5][(column+i)%5]=count;
			}
			row = (row - 4 +5)%5 +1;
			column = (column+4)%5;
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				result += mtx[i][j]+"  ";
			}
			result +="\n";
		}
		return result;
	}
	public static String matrixConversion() {
		String result = "";
		int[][] mtxA= new int[5][3];
		int[][] mtxB= new int[3][5];
		int count=0;
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
		return result;
	}
}
