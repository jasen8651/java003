package java13;

public class Beer {
	String type; //종류
	String modal; //이름
	
	
	public Beer(String type, String modal) {
		super();
		this.type = type;
		this.modal = modal;
	}
	public void drink() {
		System.out.println("마신다.");
	}
	public String getType() {
		return type;
	}
	public String getModal() {
		return modal;
	}
}
