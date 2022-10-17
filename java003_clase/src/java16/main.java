package java16;

public class main {

	public static void main(String[] args) {
		Rect rect = new Rect(10,20);
		System.out.println("사각형 넓이"+ rect.getArea());
		
		Tri t = new Tri(10,20);
		System.out.println("삼각형 넓이"+t.getArea());
	}

}
