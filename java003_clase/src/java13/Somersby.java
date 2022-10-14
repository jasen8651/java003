package java13;

public class Somersby extends Beer{

	String flavor; //맛
	int ABV =6; // 도수
	
	Somersby(String model, String flString){
		super("밀맥주", model);
		this.modal= model;  // 모델은 상위 beer 클래스로부터 상속받음
		this.flavor =flString;
	}
	
	Somersby(String model, String fString, int ABV){
		super("밀맥주", model);
		this.modal= model;  // 모델은 상위 beer 클래스로부터 상속받음
		this.flavor=fString;
		this.ABV =ABV;
	}
	
	//메서드 입력
	public void flavordrink() {
		System.out.println(modal+"맥주의"+flavor+"맛을 마심");
	}
	public String getFavor() {
		return flavor;
	}
	public int getABV() {
		return ABV;
	}

}
