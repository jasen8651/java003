package java29;

public class main6 {

	public static void main(String[] args) {
		System.out.printf("35276은");
		prnDisplay(numCheck("35276"));
		
		System.out.printf("2_8a은");
		prnDisplay(numCheck("2_8a"));
	}
	public static boolean numCheck(String data) {
		char[] arr= data.toCharArray();
		for(int i=0; i<data.length(); i++) {
			if(!(data.charAt(i)>= '0' && data.charAt(i)<='9' )) {
				return false;		
				}
		}
		return true;
	}
	public static void prnDisplay(boolean chk) {
		if(chk) {
			System.out.println("숫자임");
		}else {
			System.out.println("문자인ㅁ");
		}
	}

}
