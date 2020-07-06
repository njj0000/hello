abstract class Shape {         
 
    abstract  public void getArea();
}
class Circle extends Shape {
double r;
 	 Circle(double r1) 
	{
		r=r1;
	}
 public void getArea() {
      System.out.println("¿øÀÇ ³ÐÀÌ : " + (3.14 * r*r));
   }
}

class Rectangle extends Shape {
double h;
double v;
	Rectangle(double h1, double v1)
	{
		h=h1;
		v=v1;
	}
  
 public void getArea() {
      System.out.println("»ç°¢ÇüÀÇ ³ÐÀÌ : " + (h * v));
   }
}
class Triangle extends Shape {

double a;
double h;
	Triangle(double a1, double h1)
	{
		a=a1;
		h=h1;
	}
   public void getArea() {
	
      System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : " + (a * h / 2));
   }
}
public class kim070603 {
   public static void main(String args []) {
 	Shape sha[] = new Shape[3];
	sha[0]  = new Triangle(3,4);
	sha[1]  = new Rectangle(4,4);
 	sha[2]  = new Circle(5);
	
	for (int i=0; i<=2; i++)
	{
		sha[i].getArea();
	}
       }
}