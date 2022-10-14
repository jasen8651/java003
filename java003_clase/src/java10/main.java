package java10;

public class main {

	public static void main(String[] args) {
		Eg c = new Eg();
		c.setWater(1000);
		c.setSpeed(100);
		c.setColor("red");
		c.waterSpread();
		System.out.println(c.toString());
		
		Owner oe =new Owner();
		oe.setSeat(8);
		oe.information();
		oe.setSpeed(80);
		oe.setColor("red");
		System.out.println(oe);
	}

}
