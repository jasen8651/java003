package java13;

public class main {

	public static void main(String[] args) {
		Somersby sb = new Somersby("썸머스비", "사과",4);
		
		//섬머스비 맥주 사과맛 객체 생성
		System.out.println( "타입 :"+ sb.getType());
		//beer 클레스로부터 상속
		System.out.println("알콜도수 :"+ sb.getABV());
		//somesby클래스로부터 상속
		System.out.println("맛 :"+sb.getFavor());
		
		//썸머스비 클레스 메서드 호출
		sb.flavordrink();
	}

}
