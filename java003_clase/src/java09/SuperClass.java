package java09;

public class SuperClass {
	int x,y,z;
	
	public SuperClass() {
		System.out.println("**** x,y,z에 값 채우기");
	}
	public SuperClass(int k) {
		this();
		this.x=k;
		System.out.println(k+"을 넘겨 받은 샐성자");
	}
	public SuperClass(int a, int b) {
		this(a);
		this.y=b;
		System.out.println(a+" "+ b+" 를 넘겨받은 생성자");
	}
	public SuperClass(int a, int b, int c) {
		this(a);
		z=c;
		System.out.println(a+" "+ b+" "+c);
	}
	
	public void display() {
		System.out.printf("%d %d %d"+ x, y, z );
	}
	
}
