import java.util.*;

public class kim052504{
    public static void main(String[] args) {

    double a;
    double b;
    double sum;
    double cha;    
        
        Scanner in = new Scanner(System.in);

        System.out.print("숫자를 입력받으세요");    
        a = in.nextDouble();
        System.out.print("숫자를 입력받으세요"); 
        b = in.nextDouble();
        
        sum= a+b;
        cha = a-b;
        
        if (sum>cha)
        {
	Sysytem.out.print("합이 차보다 큽니다");
        }
        else 
        {
        	if (sum<cha)
        	{
 	   Sysytem.out.print("합이 차보다 작습니다");
            }
	else 
	{	
	     Sysytem.out.print("합이 차랑 같습니다");
	}
         }







		}

	}
}
