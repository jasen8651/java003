package java12;

public class main {

	public static void main(String[] args) {
		BasicTV btv = new BasicTV();
		btv.isPowerOn=true;
		btv.channer=8;
		btv.volume=10;
		btv.display();
		
		SmartTv stv = new SmartTv();
		stv.isPowerOn=true;
		stv.channer=10;
		stv.volume=3;
		stv.ip="129.285.34.1";
		stv.display();

	}

}
