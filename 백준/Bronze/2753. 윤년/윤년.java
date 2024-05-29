import java.io.*;
import java.util.*;

public class Main {
    static int A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = Integer.parseInt(st.nextToken());

        if(A%4==0 & A%100!=0){
            System.out.println(1);
        } else if (A%400==0) {
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
