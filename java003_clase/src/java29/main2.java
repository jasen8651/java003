package java29;

public class main2 {

	public static void main(String[] args) {
		// 출력 결과  ip :127.0.0.1
		// prit:8080
		
		String sn = "127.0.0.1.:8000";
		
		
		System.out.println("ip:"+sn.substring(0,9));
		System.out.println("port:"+sn.substring(10));
		
		int index = sn.indexOf(":");
		System.out.println("ip"+sn.substring(0, index));
		System.out.println("port"+sn.substring(index+1));
	}

}
