package java24;

public class Hometv {
	String maker;
	public Hometv() {
		// TODO Auto-generated constructor stub
	}
	public Hometv(String maker) {
		this.maker =maker;
	}
	public void turnOn() {
		System.out.printf("%s 티비 전원을 킨다.\n",maker);
	}
	public void turnOff() {
		System.out.printf("%s 티비 전원을 끈다.\n",maker);
	}
	public void soundup() {
		System.out.printf("%s 티비 소리을 올린다.\n",maker);
	}
	public void sounddown() {
		System.out.printf("%s 티비 소리을 내린다.\n",maker);
	}
	public void call() {
		System.out.printf("lg call");
	}
	public void move() {
		System.out.println("samsoung mone");
	}
	}
