package java26.part01;

public class Child  extends Parent{
	public Child() {
	
	}

	void call() {
		System.out.println("Child call");
	}
	
	@Override
	void process() {
	  System.out.println("Child process");
	}
}
