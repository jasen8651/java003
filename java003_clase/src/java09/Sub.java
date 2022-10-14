package java09;

public class Sub extends SuperClass {
	public Sub() {
		// TODO Auto-generated constructor stub
	}
	public Sub(int a, int b, int c) {
		super(a,b,c);
		display();
		sumData();
	}
	public void sumData() {
		System.out.println("합" + (x+y+z));
	}
}
