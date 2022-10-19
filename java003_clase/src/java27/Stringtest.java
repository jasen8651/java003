package java27;

public class Stringtest  extends Object{
	private char[] arr;
	
	public Stringtest() {
		// TODO Auto-generated constructor stub
	}
	public Stringtest(char[] arr) {
		this.arr = arr;
	}
	public int length() {
		return arr.length;
	}
	public boolean isUpperCase(int index) {
		if(arr[index]>= 'A' && arr[index]<='Z') {
			return true;
		}else {
			return false;
		}
	}
	public boolean isLowerCase(int index) {
		if(arr[index]>= 'a' && arr[index]<='z') {
			return true;
		}else {
			return false;
		}
	}
}
