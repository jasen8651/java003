package java15_interface;

public class java01 {

	public static void main(String[] args) {
		/*
		 * 클레스의 종류 \ 클래스, 추상클레스 ,인터페이스 메소드 정의 : 메소드 선언부+ 메소드 구현부 public boid pen(){} 추상
		 * 메소드 : 선언부만 정의된 메소드, abstract public void prn(){} 추상클레스 : 추상메소드를 가지는 클레스
		 * abstract public class test{}
		 * 
		 * 추상클레스 목적 : 추상메소드를 강제 오버라이딩하고 객체 생성 가능하게 함
		 */
		//추상클레스는 객체 생성 불가
		Senndaabs sa = new Senndaabs();
		sa.work();
		
		Truckabs ta = new Truckabs();
		ta.work();
	}
}
