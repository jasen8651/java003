package part01;

public class MyColorPoint extends MyPoint{
	
	
	
	String color;
    MyColorPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    protected void reverse(){
        int temp;
        temp = x;
        x = y;
        y = temp;
    }
    protected void show(){
        System.out.println(x + "," + y + "," +color);
    }
    
}