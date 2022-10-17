package java22;

public class main {

	public static void main(String[] args) {
		/*
		 * 데이터 타입
		 * 객체 형변환- 참조데이터타입
		 * 업케스팅
		 * 다운케스팅
		 */
		Parent p = new Parent();
		Child c = new Child();
		
		p=c;//업케스팅
		p.process();//-> Parent p= new Child
		
		
		Child d = (Child) p; 
		
		
		Parent pt = new Parent();
		pt.process();
		
		
		// 다운케스팅
		Child cn = (Child)pt;
		cn.call();
		
	}

}
