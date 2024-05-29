import java.io.*;
import java.util.*;

public class Main {
    static Long A;
    static int B,C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        A = Long.parseLong(br.readLine());
        for(int i = 0; i<A; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            bw.write(B+C+"\n");
        }
        bw.flush();
        bw.close();
    }
}
