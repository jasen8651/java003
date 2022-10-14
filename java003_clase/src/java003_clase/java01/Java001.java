package java003_clase.java01;

public class Java001 {

	public static void main(String[] args) {
		Child_001  child = new Child_001();
		System.out.println("b="+child.b);
		System.out.println("a="+child.a);
		child.display();
		System.out.println(child.toString());
		//ㅊc맴버변수 private 선언이 안되서 오류
		//System.out.println("c"+child.c);
		// 상송 : 기본클래스가 가지고 있는 맴버들을 새로 만든 클래스에서 직접만들자 않고 상속받아 새 클레스가 자신의 맴버변수로 사용
		/*
		 * 1. 기본 클래스를 재사용하여 새로운 클래스를 정의
		 * 2. 두 클래스를 조상과 자손 관계를 맺음
		 * 3. 상속을 하는 쿨래스 : 슈펔틀래스, 부모, 기본클래스
		 * 4. 상속 받는 클래스 서브, 자식 유도 클래스
		 * 자식은 모든 자원 상속 
		 * 상속받는 키워드 extend/ 클래스에 클래스를 상속 : 단일상속, 인터페이스에 인터페이스 상속 : 다중 상속
		 */
	}

}
