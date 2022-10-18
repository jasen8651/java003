package part02;

public class MotorBicycle implements IBicycle, IMotor {
	// 멤버변수 추가
	int id;
	String brand;
	
	public MotorBicycle() {
		
	}

	public MotorBicycle(int id,String  brand) {
		super();
		this.id = id;

	}

	// IBicycle에 있는 추상 메소드를 구현하세요
	public void prtInfo() {
		System.out.printf("Frame Size : %d\n", FrameSize_L);
		System.out.printf("Motor Size : %d\n", Motor_Size_Large);
	}

	// IMotor에 있는 추상 메소드를 구현하세요
	public void start() {
		System.out.println("%s 모터 start");
	}

	// IMotor에 있는 추상 메소드를 구현하세요
	public void stop() {
		System.out.println("%s 모터 stop");
	}

}
