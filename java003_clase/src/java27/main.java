package java27;

public class main {

	public static void main(String[] args) {
		/*
		 * java api 
		 * 클레스 중에서 최상위 클레스
		 * 오브젝트를 제외한 모든 클레스들은 오브젝트를 상속 받음
		 * 자바롱 패키지에서 제공하는 클레스
		 * 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
		 */
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		int x =5;
		int y =5;
		System.out.printf("x=%d  y=%d  x==y:%b\n",x,y, x==y);
		
		Object ojt = new Object();
		System.out.printf("obj == djt:%b\n", obj==ojt);
		System.out.printf("obj.equals(ojt):%b\n", obj.equals(ojt));
		
		System.out.println(obj.getClass());
		System.out.println(obj.getClass().getName());
		
		int num = obj.hashCode();
		System.out.println(num);
		
		
	}

}
