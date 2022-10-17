package java23;

public class Manager extends Employee{
	String name;
	String dept;
	String depth;
	
	
	public Manager(String name, String dept, String depth) {
		super();
		this.name = name;
		this.dept = dept;
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s dept:%s depth:%s", name, dept, depth);
	}
}
