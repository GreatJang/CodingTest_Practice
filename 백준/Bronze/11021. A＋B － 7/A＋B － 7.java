import java.io.*;
import java.util.*;

public class Main {
    static int A,B,C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        A = Integer.parseInt(br.readLine());
        for(int i = 1; i<=A; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+(B+C)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
