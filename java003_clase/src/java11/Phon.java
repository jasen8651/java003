package java11;

public class Phon {
	 private String maker;//삼성 lg, 샤오미
	 private String modal;
	 private int price;
	 
	 public Phon() {
		
	}

	public Phon(String maker, String modal, int price) {
		super();
		this.maker = maker;
		this.modal = modal;
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return String.format("%-4s, %-10s, %6d", maker, modal, price);
	}
	 
}
