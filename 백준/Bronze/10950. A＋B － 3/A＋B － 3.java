import java.io.*;
import java.util.*;

public class Main {
    static int A,B,C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        for(int i = 0; i<A; i++){

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            System.out.println(B+C);
        }
    }
}
