package part03;

public class Whale extends Fish implements Mammal{

		@Override
		public void bear() {
			// TODO Auto-generated method stub
			super.bear();
		}
		
		public Whale() {
			String bear = "고래";
			System.out.println(bear+"가 새끼를 나았다.");
		}
}
