package java29;

public class main4 {

	public static void main(String[] args) {
		System.out.println("<<첫번째 메세지>>");
		handleMessage("PROD-000001:IPHON4:940000:4:애플");
		System.out.println("<<두번째 메세지>>");
		handleMessage("PROD-0002:갤럭시s10:9400:4:삼성");
		

	}

	private static void handleMessage(String sn) {
		String[] data = sn.split(":");
		if(data.length==5) {
			System.out.println("제품 아이디 :"+data[0]);
			System.out.println("제품명 :"+data[1]);
			System.out.println("가격 :"+data[2]);
			System.out.println("수량 :"+data[3]);
			System.out.println("제조사 :"+data[4]);
		}else {
			System.out.println("메세지 형식 잘못됨");
			System.out.println("메세지는 형식에 맞아야됨");
		}
		
		
		
		
	}

}
