package java10;

public class Owner extends Car{
	private int seat;
	
	public Owner() {
		// TODO Auto-generated constructor stub
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	void information() {
		System.out.println(seat+"인증 차량입니다");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("차량의 색상 %s 속도 %d",color, getSpeed());
	}
}
