import java.util.*;

public class kim052509{
    public static void main(String[] args) {

    double a;
    double b;
    double sum;
    
	Scanner in=new Scanner(System.in);

	System.out.print("원가를 입력받으세요"); 
	a = in.nextDouble();
	System.out.print("판매가를 입력받으세요");
	b = in.nextDouble();
	
	sum= (b-a)/b;
	if (sum>=0.3)
	{
	
		System.out.printf("최상의수익입니다");
	}
	else
	{
		 if (sum>=0.2)
		{
	
			System.out.printf(" 좋은수익입니다");
		}
		else
           		{
			if (sum>=0.1)
			{
			System.out.printf(" 보통수익입니다");
			}
			else
			{
			System.out.printf(" 수익이 없음니다");
			}
		}
            }
    }
}