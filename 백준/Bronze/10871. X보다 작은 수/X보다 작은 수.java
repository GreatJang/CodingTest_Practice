import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        int[] A = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st2.nextToken());
            if(A[i] < M){
                bw.write(A[i] + " ");
            }
        }
        bw.flush();
    }
}
