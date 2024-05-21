import java.util.*;
public class Main{
    public static void main(String[] args){
        double A,B,C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = A/B;
        System.out.printf("%.10f", C);
    }
}