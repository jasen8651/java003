package java12;

public class BasicTV {
	boolean isPowerOn;
	int channer;
	int volume;
	public BasicTV() {
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("tv의 현 상태");
		System.out.println("전원"+isPowerOn);
		System.out.println("채널"+channer);
		System.out.println("볼륨"+volume);
	}
}
