import java.util.*;

public class kim052508{
    public static void main(String[] args) {

    double a;
    double b;
    double sum;
    
        
        Scanner in = new Scanner(System.in);

        System.out.print("��ǰ�� ������ �Է¹�������");    
        a = in.nextDouble();
        System.out.print("�ܰ��� �Է� ��������"); 
        b = in.nextDouble();
        
        sum= a*b;
       
        
        if (sum>=20)
        {
	sum=sum-sum*0.2;
        }
        else 
        {
        	if (sum>=10)
        	{
 	  sum = sum -sum*0.1;
     	}
        }
 	
	System.out.printf("�ѱݾ� %d\n",(int)sum);





		

	}
}
