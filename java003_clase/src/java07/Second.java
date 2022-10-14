package java07;

public class Second extends Fist{
	int b=20;
	
	void display() {
		System.out.println("b="+b);
	}
	public String toString() {
		return String.format("b=%d",b);
	}
	void supreThisMethod() {
		super.display();
		this.display();
	}
}
