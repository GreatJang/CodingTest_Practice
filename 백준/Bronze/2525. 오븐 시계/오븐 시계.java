import java.io.*;
import java.util.*;

public class Main {
    static int A,B,C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(br.readLine());

        B = B + C;

        if(B<60){
            System.out.println(A + " "+ B);
        } else if (B==60) {
            A = A+1;
            if(A==24){
                A=0;
            } else if (A>24) {
                A = A-24;
            }
            B = 0;

            System.out.println(A + " "+ B);
        } else if (B>60) {
            A = A + B/60;
            if(A==24){
                A=0;
            } else if (A>24) {
                A = A-24;
            }
            B = B%60;

            System.out.println(A + " "+ B);
        }
    }
}
