package java08;

public class Bird extends PetOver {

	@Override
	public void move() { 
		System.out.println("서브 클레스 () : 새가 날아간다");
		super.move();
	}

}
