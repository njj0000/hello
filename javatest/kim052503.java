import java.util.*;

public class kim052503{
    public static void main(String[] args){

       double gum;
       double kg;
       double all;
       double se;
        
        Scanner in = new Scanner(System.in);

        System.out.print("기본요금");
        gum = in.nextDouble();

        System.out.print("kg당 사용요금");
        kg = in.nextDouble();

        System.out.print("사용량");
        all = in.nextDouble();

         se = (gum+(kg*all))+(gum+(kg*all))*0.09

        System.out.printf("전기요금은 %f\n",se);
        

	}
}