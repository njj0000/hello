import java.util.*;

public class kim052509{
    public static void main(String[] args) {

    double a;
    double b;
    double sum;
    
	Scanner in=new Scanner(System.in);

	System.out.print("������ �Է¹�������"); 
	a = in.nextDouble();
	System.out.print("�ǸŰ��� �Է¹�������");
	b = in.nextDouble();
	
	sum= (b-a)/b;
	if (sum>=0.3)
	{
	
		System.out.printf("�ֻ��Ǽ����Դϴ�");
	}
	else
	{
		 if (sum>=0.2)
		{
	
			System.out.printf(" ���������Դϴ�");
		}
		else
           		{
			if (sum>=0.1)
			{
			System.out.printf(" ��������Դϴ�");
			}
			else
			{
			System.out.printf(" ������ �����ϴ�");
			}
		}
            }
    }
}