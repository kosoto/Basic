package projectEuler;
//a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
public class problem9 {
	public static void main(String[] args) {
		double temp =0;
		for(int i=2;i<400;i++) {
			for(int j=2;j<400;j++) {
				temp=Math.sqrt(i*i+j*j);
				if((temp-(int)temp)==0.0 &&(i+j+temp)==1000) {
					System.out.println((int)(i*j*temp));
					return;
				}
			}
		}
	}
}
