import java.util.*;

public class kim052503{
    public static void main(String[] args){

       double gum;
       double kg;
       double all;
       double se;
        
        Scanner in = new Scanner(System.in);

        System.out.print("�⺻���");
        gum = in.nextDouble();

        System.out.print("kg�� �����");
        kg = in.nextDouble();

        System.out.print("��뷮");
        all = in.nextDouble();

         se = (gum+(kg*all))+(gum+(kg*all))*0.09

        System.out.printf("�������� %f\n",se);
        

	}
}