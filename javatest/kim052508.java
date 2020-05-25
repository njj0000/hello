import java.util.*;

public class kim052508{
    public static void main(String[] args) {

    double a;
    double b;
    double sum;
    
        
        Scanner in = new Scanner(System.in);

        System.out.print("상품의 갯수를 입력받으세요");    
        a = in.nextDouble();
        System.out.print("단가를 입력 받으세요"); 
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
 	
	System.out.printf("총금액 %d\n",(int)sum);





		

	}
}
