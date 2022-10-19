package java29;

public class main3 {

	public static void main(String[] args) {
		String sn ="korea";
		char[] data = display(sn);
		System.out.println(data);
		System.out.println(sn);

	}
	public static char[] display(String alpe) {
		char[] arr = new char[alpe.length()];
		for(int i=0; i<alpe.length(); i++) {
			arr[i]=alpe.charAt(arr.length-i-1);
		}
		return arr ;
	}
}
