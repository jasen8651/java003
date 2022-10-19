package java29;

public class main {

	public static void main(String[] args) {
		String str = new String("KOerSa,jsp,java");
		System.out.println("문자열 길이 :"+str.length());
		System.out.println("대문자"+ str.toUpperCase());
		System.out.println("소문자"+ str.toLowerCase());
		System.out.println("문자"+str.charAt(0));
		System.out.println("인덱스"+str.indexOf('a'));
		System.out.println("인덱스"+str.indexOf(97));
		System.out.println("인덱스"+str.lastIndexOf('a'));
		System.out.println("범위:"+str.substring(5));
		System.out.println("범위:"+str.substring(2,8));
		
		String[] arr = str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s\n",i,arr[i]);
		}
		
		int x=10;
		int y=20;
		System.out.printf("%d+%d=%d\n", x,y, x+y);
		
		String s1 =String.valueOf(x);
		String s2 =String.valueOf(y);
		System.out.printf("%s+%s=%s", s1,s1 ,s1+s2);
		
		char[] data = {'1','2','3'};
		String s3 = String.valueOf(data);
		System.out.println(s3);
	}

}
