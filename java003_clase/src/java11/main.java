package java11;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phon[] ph = new Phon[6];
		ph[0]= new Phon("삼성", "sw-0", 200000000);
		ph[1]= new Phon("lg", "sw-0", 200000000);
		ph[2]= new Phon("애플", "sw-0", 200000000);
		ph[3]= new Phon("소닉", "sw-0", 200000000);
		ph[4]= new Phon("애플", "sw-0", 200000000);
		ph[5]= new Phon("삼성", "sw-0", 200000000);
		for(Phon hh: ph)
			System.out.println(hh.toString());
		
		System.out.println("-----------");
		Smartphon[] sp = new Smartphon[4];
		sp[0] = new Smartphon("삼쇼", "t1", 200, "101-5555", "sh");
		sp[1] = new Smartphon("sh성", "sw-0", 20000, "010-5582-5881", "sg");
		sp[2] = new Smartphon("삼성", "sw-0", 2000, "010-5582-5881", "sg");
		sp[3] = new Smartphon("삼성", "sw-0", 2000, "010-5582-5881", "sg");
		for(Smartphon ss : sp)
			System.out.println(ss.toString());
	}

}
