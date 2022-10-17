package java18;

public class MAIN {

	public static void main(String[] args) {
		/*인터페이스 : 추산메소드와 상수를 가지고 있는 형태
		*
		 * 클레스 작성에 도움을 주기 위한 목적으로 제공
		 * implements : 클레스에 인터페이스를 상속할때 사용
		 * 인터페이스는 접근제어자로 public만제공
		 * 인테페잇,의 추상 메소드에 absreact 키웍드 명시 안함
		 * 모든 인터페이스의 메소드는 목시적으로 public abstract 이다
		 * 객체 생성 x 참조형타입 사영
		 * 
		 */
		System.out.println(CarRan.carCoun);
		CarRan.Sun s = new CarRan.Sun();
		
		Truck tk = new Truck();
		tk.prn();
	}

}
