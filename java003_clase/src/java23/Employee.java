package java23;

public class Employee {
	String name;
	String code;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name : %s code : %s", name, code);
	}
	public String pay() {
		return String.format("%s님의 급여 %d입니다.\n", name,50000);
	}
	
	public String display() {
		return String.format("%s님의 금무지역은 %s\n",name, "soul");
	}
}
