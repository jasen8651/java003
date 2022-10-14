package java13;

public class main {

	public static void main(String[] args) {
		Somersby sb = new Somersby("썸머스비", "사과",4);
		
		System.out.println( "타입 :"+ sb.getType());
		System.out.println("알콜도수 :"+ sb.getABV());
		
		System.out.println("맛 :"+sb.getFavor());
		
		sb.flavordrink();
	}

}
