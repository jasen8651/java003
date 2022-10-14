package java11;

public class Smartphon extends Phon{
	private String number;
	private String type;
	
	public Smartphon() {
		// TODO Auto-generated constructor stub
	}

	public Smartphon(String number, String type,String maker, String modal, int price) {
		super(maker, modal, price);
		this.number = number;
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		return String.format("%-4s  %-10s  %6d %s  %s",
				getMaker(), getModal(), getNumber(),getPrice());
	}
	
}
