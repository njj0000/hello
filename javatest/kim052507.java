import java.util.*;

public class kim052504{
    public static void main(String[] args) {

    double a;
    double b;
    double sum;
    double cha;    
        
        Scanner in = new Scanner(System.in);

        System.out.print("���ڸ� �Է¹�������");    
        a = in.nextDouble();
        System.out.print("���ڸ� �Է¹�������"); 
        b = in.nextDouble();
        
        sum= a+b;
        cha = a-b;
        
        if (sum>cha)
        {
	Sysytem.out.print("���� ������ Ů�ϴ�");
        }
        else 
        {
        	if (sum<cha)
        	{
 	   Sysytem.out.print("���� ������ �۽��ϴ�");
            }
	else 
	{	
	     Sysytem.out.print("���� ���� �����ϴ�");
	}
         }







		}

	}
}
