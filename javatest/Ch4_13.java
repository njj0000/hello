import java.util.*;

public class Ch4_13 {
    public static void main(String[] args){
        int one; 
        int pan;
        int grd;

        Scanner in = new Scanner(System.in);
        System.out.print("������ �Է��ϼ���");
        one = in.nextInt();
        System.out.print("�Ǹž��� �Է��ϼ���:");
        pan = in.nextInt();
        System.out.print("������ �Է��ϼ���:");
        grd = in.nextInt();

        System.out.printf("�� �Ǹž��� %d\n",pan*one);
        System.out.printf("�Ǹ������� %d\n",(pan-one)*grd);
}


}