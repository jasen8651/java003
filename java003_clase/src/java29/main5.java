package java29;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stn = new String("java_jsp_spring");
		System.out.println(peocess(stn.toCharArray()));
	}
	public static char[] peocess(char arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='_') {
				arr[i]=' ';
			}
			
		}
	
		
		return arr;
	}
}
