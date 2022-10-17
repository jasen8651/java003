package java23;

public class main {

	public static void main(String[] args) {
		// 다형성 
		/*
		 * 여러가지 형태를 가질수 있는 능력
		 * 자바에서는 한타입의 참조변수로 여러 타입의 객체 참조
		 * 
		 * 바인딩 : 메소드 호출에 실제 메소드와 연결하는 기술
		 * 정적바인딩 : 컴파일단계에서 어던 클레스의 메소드가 호출되느느지 연결하는 기술
		 * 동젇 바인딩 : 실행단계에서 어던 클레스의 메소드가 호출되느느지 연결하는 기술
		 */
		Employee emp = new Employee("steven","code01");
		//System.out.println(emp.pay);
		process(emp);
		
		Manager mg = new Manager("neesa", "code02", "second");
		process(mg);
	}
	/*
	 * public static void process(Employee emp) {
	 * System.out.println(emp.toString()); } public static void process(Manager mg)
	 * { System.out.println(mg.toString()); }
	 */
	public static void process(Object obj) {
		System.out.println(obj.toString());
		if(obj instanceof Employee) {
			Employee em = (Employee) obj;
			System.out.println( em.pay());
		}else if(obj instanceof Manager){
			Manager mg = (Manager)obj;
			System.out.println(mg.display());
		}
		
	}
}
