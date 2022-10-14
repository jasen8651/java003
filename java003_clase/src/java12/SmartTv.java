package java12;

public class SmartTv extends BasicTV{
	String ip;
	
	public void display() {
		System.out.println("tv의 현 상태");
		System.out.println("전원"+isPowerOn);
		System.out.println("채널"+channer);
		System.out.println("볼륨"+volume);
		System.out.println("ip"+ip);
	}

}
