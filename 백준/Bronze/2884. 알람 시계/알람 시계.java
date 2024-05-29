import java.io.*;
import java.util.*;

public class Main {
    static int A,B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        B = B-45;

        if(B>0 || B==0){
            System.out.println(A + " "+ B);
        } else if (B<0) {
            B = B+60;
            if(A == 0){
                A = 24;
            }
            A = A-1;
            System.out.println(A + " "+ B);
        }
    }
}
