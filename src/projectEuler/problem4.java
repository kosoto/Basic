package projectEuler;
/**
 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
*/
public class problem4 {
	public static boolean checkPal(int pal) {
		boolean result = false;
		int length = String.valueOf(pal).length();
		for(int i=0;i<length/2;i++) {
			if(String.valueOf(pal).charAt(i)==String.valueOf(pal).charAt(length-1-i)) {
				result = true;					
			}else {
				result = false; break;
			}		
		}
		return result;
	}	
public static void main(String[] args) {
int pal = 0;
int result = 0;
boolean flag = false;	
	for(int i=999;i>=100;i--) {
		for(int j=999;j>=100;j--) {
			pal=i*j;
			flag = checkPal(pal);
			if(flag==true) {
				result=(pal>result)?pal:result;
			}
		}		
	}
	System.out.println(result);
}
}
