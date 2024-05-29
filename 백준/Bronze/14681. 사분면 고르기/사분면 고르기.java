import java.io.*;
import java.util.*;

public class Main {
    static int A,B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        if(A>0 & B>0){
            System.out.println(1);
        } else if (A<0 & B>0) {
            System.out.println(2);
        } else if (A<0 & B<0){
            System.out.println(3);
        } else if (A>0 & B<0){
            System.out.println(4);
        }
    }
}
