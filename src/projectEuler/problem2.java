package projectEuler;

public class problem2 {
public static void main(String[] args) {
	int num1=1;
	int num2=2;
	int term = 0;
	int temp = 3;
	int sum = 0;
	for(int i=0;term<=4000000;i++){
		temp=term;
		term=num1+num2;
		num1=num2;
		num2=term;
		sum +=(term%2==0)?term:0;
	}
	System.out.println(sum);
}
}
