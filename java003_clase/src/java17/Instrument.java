package java17;

abstract public class Instrument {
	String name;
	
	public Instrument() {
		// TODO Auto-generated constructor stub
	}
	public Instrument(String name) {
		this.name = name;
	}
	
	abstract public void play();

}
