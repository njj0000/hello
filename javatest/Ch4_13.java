import java.util.*;

public class Ch4_13 {
    public static void main(String[] args){
        int one; 
        int pan;
        int grd;

        Scanner in = new Scanner(System.in);
        System.out.print("원가를 입력하세요");
        one = in.nextInt();
        System.out.print("판매액을 입력하세요:");
        pan = in.nextInt();
        System.out.print("수량을 입력하세요:");
        grd = in.nextInt();

        System.out.printf("총 판매액은 %d\n",pan*one);
        System.out.printf("판매이익은 %d\n",(pan-one)*grd);
}


}