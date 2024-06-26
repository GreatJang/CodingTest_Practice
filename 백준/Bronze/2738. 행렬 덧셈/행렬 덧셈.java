import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];


        for(int i=0; i<N*2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                if(i>=N){
                    A[i - N][j] = A[i - N][j] + Integer.parseInt(st.nextToken());
                } else {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                bw.write(A[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}