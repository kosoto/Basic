package step3;

/**
 * 가위바위보
 * */
import javax.swing.JOptionPane;

public class RPSGame {
	public static void main(String[] args) {
		String player, computer = "";
		int random = 0;
		int ref = 0;
		int count = 0, totalcount = 0, draw = 0, lose = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("0.결과보기 1.게임하기")) {
			case "0":
				lose = totalcount - count - draw;
				JOptionPane.showMessageDialog(null,
						"player : " + totalcount + "전" + count + "승" + draw + "무" + lose + "패");
				return;
			case "1":
				player = JOptionPane.showInputDialog("player : 2.가위 0.바위 5.보");
				for (int i = 0; i < 1; i++) {
					random = (int) (Math.random() * 10);
					if (random == 0 || random == 2 || random == 5) {
						computer = String.valueOf(random);
					} else {
						i--;
					}
				}

				ref = Integer.parseInt(player) - Integer.parseInt(computer);
				switch (ref) {
				case 2:
				case -5:
				case 3:
					totalcount++;
					break;
				case -3:
				case -2:
				case 5:
					count++;
					totalcount++;
					break;
				case 0:
					totalcount++;
					draw++;
				}

			}
		}
	}
}
