package step1;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price = 0;
		while (true) {
			System.out.println("0.종료 1.주문");

			switch (scan.nextInt()) {
			case 0:
				System.out.print("종료합니다.");
				return;
			case 1:
				System.out.println("1.햄버거 주문 2.음료수 주문 3.사이드메뉴 4.주문완료");

				switch (scan.nextInt()) {
				case 1:
					System.out.println("1.치즈버거 2.새우버거 3.햄버거");
					int burger = scan.nextInt();
					System.out.println("몇개를 주문하시겠습니까?");
					int num1 = scan.nextInt();
					switch (burger) {
					case 1:
						price += 4000 * num1;
						break;
					case 2:
						price += 4500 * num1;
						break;
					case 3:
						price += 3500 * num1;
						break;
					default:
						System.out.println("ERROR");
						break;
					}
					break;
				case 2:
					System.out.println("1.코카콜라 2.스프라이트 3.환타");
					int drink = scan.nextInt();
					System.out.println("몇개를 주문하시겠습니까>");
					int num2 = scan.nextInt();
					switch (drink) {
					case 1:
						price += 1500 * num2;
						break;
					case 2:
						price += 1400 * num2;
						break;
					case 3:
						price += 1200 * num2;
						break;
					default:
						System.out.println("ERROR");
						break;
					}
					break;
				case 3:
					System.out.println("1.치즈스틱 2.샐러드콘 3.치킨윙");
					int side = scan.nextInt();
					System.out.println("몇개를 주문하시겠습니까?");
					int num3 = scan.nextInt();
					switch (side) {
					case 1:
						price += 2000 * num3;
						break;
					case 2:
						price += 1500 * num3;
						break;
					case 3:
						price += 2500 * num3;
						break;
					default:
						System.out.println("ERROR");
						break;
					}
					break;
				case 4:
					System.out.println("주문금액은 " + price + "입니다.");
					return;
				default:
					System.out.println("ERROR");
					break;
				}
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		}
	}
}