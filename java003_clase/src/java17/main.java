package java17;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flute f = new Flute("flute");
		System.out.println(f.name);
		f.play();
		
		Piano p = new Piano("piano");
		System.out.println(p.name);
		p.play();
	}

}
