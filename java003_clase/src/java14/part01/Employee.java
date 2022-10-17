package java14.part01;

// -(private)    + (public)    #(protected)     X : default
/* 
 * -name:String                    
 * -dept:String 
 * -pay:int
 * -score:double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:double):void
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * +setEmployee(name:String, dept:String, pay:int, score:double):void
 * +toString():String 
 */
public class Employee {
	String name;
	String dept;
	int pay;
	double scoer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public double getScoer() {
		return scoer;
	}
	public void setScoer(double scoer) {
		this.scoer = scoer;
	}
	
	@Override
	public String toString() {
		return "이름은 " + name + "이고 " + dept + "에 근무하며 급여는 "
				  + pay + "원 입사성적은 " + scoer + "입니다";
	}
	
	
	public void setEmployee(String name, String dept, int pay, double score){
		this.name=name;
		this.dept=dept;
		this.pay=pay;
		this.scoer=scoer;
	}	

}
















