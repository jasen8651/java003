package java17;

public class Flute extends Instrument{
	public Flute() {
	}
	public Flute(String name) {
		super(name);
	}
	
	
	@Override
	public void play() {
		System.out.println("입으로 분다.");
	}

}
