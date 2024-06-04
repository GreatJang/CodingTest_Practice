import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import static java.lang.System.exit;

public class Main {

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[M][N];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int answer = 0;
        Queue<Node> q = new LinkedList<>();
        
        for(int i = 0; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
                if(A[i][j] == 1){
                    q.add(new Node(i, j));
                }
            }
        }

        while (!q.isEmpty()){
            Node node = q.poll();
            int x = node.x;
            int y = node.y;

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(0 <= nx && nx < M  && 0 <= ny && ny < N && A[nx][ny] == 0){
                    A[nx][ny] = A[x][y] + 1 ;
                    q.add(new Node(nx, ny));
                }
            }
        }

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(answer < A[i][j]){
                    answer = A[i][j];
                } else if (A[i][j] == 0) {
                    bw.write("-1");
                    bw.flush();
                    exit(0);
                }
            }
        }
        bw.write(String.valueOf(answer -1));
        bw.flush();
    }
}
