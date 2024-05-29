import java.io.*;
import java.util.*;

public class Main {
    static int A,B,C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        if(A==B & A==C){
            System.out.println(10000 + (A*1000));
        } else if (A==B || A==C) {
            System.out.println(1000 + (A*100));
        } else if (B==C) {
            System.out.println(1000 + (B*100));
        } else if (A>B & A>C){
            System.out.println(A*100);
        } else if (B>A & B>C){
            System.out.println(B*100);
        } else if (C>A & C>B){
            System.out.println(C*100);
        }
    }
}
