import java.io.*;
import java.util.*;

public class Main {
    static int A,B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(A+B == 0){
                break;
            }
            bw.write(A+B+"\n");
            bw.flush();
        }
    }
}
