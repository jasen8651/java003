package java10;

public class Eg extends Car {
	private long water;
	public Eg() {
		
	}
	public void setWater(long water) {
		this.water = water;
	}
	 void waterSpread() {
		 System.out.println(water+"량의 물을 뿌린다.");
	 }
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("차량의 색깔 : %s, 속도 %d", color,getSpeed());
	}
}
