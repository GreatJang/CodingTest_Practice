import java.io.*;
import java.util.*;

public class Main {
    static int A,B,C,D,SUM;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        for(int i = 0; i<B; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            C = Integer.parseInt(st.nextToken());
            D = Integer.parseInt(st.nextToken());
            SUM = SUM + (C * D);
        }
        if(A == SUM){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
