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


	System.out.print("x��ǥ�� �Է��ϼ���:");
	int x1 =input.nextInt();

	System.out.print("y1��ǥ�� �Է��ϼ���:");
	int y1 =input.nextInt();

	System.out.print("width��ǥ�� �Է��ϼ���:");
	int width =input.nextInt();

	System.out.print("height��ǥ�� �Է��ϼ���:");
	int height =input.nextInt();
	
	Rectangle a1 =new Rectangle( x1, y1, width, height);
	System.out.println("x��ǥ�� �Է��ϼ���:",a1.showx);
	System.out.println("y��ǥ�� �Է��ϼ���:",a1.showy);
	System.out.println("���̴�:",a1.square);

	}
}

