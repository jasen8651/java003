package java15_interface;

abstract public class CarAbs {
	int speed;
	String color;
	
	public CarAbs() {
		
	}
	abstract public void work(); // 추상 메소드 
	
	public void display() {
		System.out.printf("%d %s\n", speed, color);
	}
}
