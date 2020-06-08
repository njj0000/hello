import java.util.*;
class Rectangle{
	 int x;
	 int y;
	 int width;
	 int height;
	
	Rectangle(int a, int b, int c, int d) 
	{
		this.x=a;
		this.y=b;
		this.width=c;
		this.height=d;
	}
	int showx()
	{
		return x;
	}
	int showy()
	{
		return y;
	}
	int square()
	{
		return width*height;
	}	
}	
public class kim060804{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);


	System.out.print("x좌표를 입력하세요:");
	int x1 =input.nextInt();

	System.out.print("y1좌표를 입력하세요:");
	int y1 =input.nextInt();

	System.out.print("width좌표를 입력하세요:");
	int width =input.nextInt();

	System.out.print("height좌표를 입력하세요:");
	int height =input.nextInt();
	
	Rectangle a1 =new Rectangle( x1, y1, width, height);
	System.out.println("x좌표를 입력하세요:",a1.showx);
	System.out.println("y좌표를 입력하세요:",a1.showy);
	System.out.println("넓이는:",a1.square);

	}
}

