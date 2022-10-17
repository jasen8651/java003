package java16;
//추상클레스
abstract public class Shape {
	private int width;
	private int height;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	abstract double getArea();
	
}
