package codingStudio;

public class nexon {
public static void main(String[] args) {
	int sum = 0;
	//int n = 0;
	int dn = 0;
	for(int n=1;dn<6000;n++) {
		for(int i=0;i<String.valueOf(dn).length();i++) {
			dn = Character.getNumericValue(String.valueOf(dn).charAt(i));
		}
		dn+=n;
	}
	

}
}
