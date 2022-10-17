package java25;

	class ExanA{
		void prn() {}
	}
	class ExanB extends ExanA{
		void prn() {}
	}
	class ExanC extends ExanB{
		void prn() {}
	}
	
	
public class Java_insanceod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExanB bb= new ExanB();
		System.out.println(bb instanceof ExanA);
		
		ExanA aa= new ExanA();
		System.out.println(aa instanceof ExanB);
		
		ExanA ea = new ExanA();
		System.out.println(ea instanceof ExanA);
		System.out.println(ea instanceof ExanB);
		System.out.println(ea instanceof ExanC);
	}

}
