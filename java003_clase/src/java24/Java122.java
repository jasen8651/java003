package java24;

public class Java122 {
	public static void process(Hometv tv) {
		tv.turnOn();
		tv.soundup();
		if(tv instanceof Samsoung) {
			Samsoung stv = (Samsoung)tv;
			stv.move();
		}else if (tv instanceof LGtv) {
			LGtv ltv = (LGtv)tv;
			ltv.call();
		}
	}

	public static void main(String[] args) {
		LGtv lg= new LGtv("lg");
		process(lg);
		
		Samsoung sg = new Samsoung("samsoung");
		process(sg);
	}

}
