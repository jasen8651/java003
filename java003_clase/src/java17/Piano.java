package java17;

 public class Piano extends Instrument{
	public Piano() {
		// TODO Auto-generated constructor stub
	}
	public Piano(String name) {
		super(name);
	}
	
	@Override
	public void play() {
		System.out.println("손가락으로 누른다.");
		
	}
}
