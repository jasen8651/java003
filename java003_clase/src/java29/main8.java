package java29;

public class main8 {

	public static void main(String[] args) {
		/*
		 * 정규화 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾기 위해 사용하는 것으로 미리 정의된 기호와 문자 이용한 문자열
		 * 
		 */
		String sn = "java korea";
		String sg = "";
		
		for(int i=0; i<sn.length(); i++) {
			char data = sn.charAt(i);
			if(data == 'a' || data == 'r') {
				sg+="_";
			}else {
				sg+=data;
			}
		}
		System.out.println(sg);
		System.out.println("regular experssion를 이용한 문자 변경");
		System.out.println(sn.replace("[ar]", "_"));
	}

}
