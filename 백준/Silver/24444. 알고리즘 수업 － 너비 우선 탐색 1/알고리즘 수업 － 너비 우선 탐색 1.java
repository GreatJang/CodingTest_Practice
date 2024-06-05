import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++){
            graph.add(new ArrayList<>()); // 각 정점에 대해 빈 리스트를 추가하여 그래프의 인접 리스트를 초기화합니다.
        }

        for (int i=0; i< M; i++){ // M 개의 간선을 입력받아 그래프에 추가
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v); // 시작 정점 u의 리스트에 끝 정점 v를 추가한다.
            graph.get(v).add(u); // 끝 정점 v의 리스트에 끝 정점 u를 추가한다.
        }

        for(int i=1; i<=N; i++){
            Collections.sort(graph.get(i)); // 각 정점의 인접 리스트를 오름차순으로 정렬
        }

        boolean[] visited = new boolean[N+1]; // 방문 여부를 저장하는 배열 // 정점 번호가 1부터 시작하므로 크기는 N+1
        int[] order = new int[N+1]; // 방문 순서를 기록할 배열, 초기값은 0 // order의 인덱스를 node로 가정
        Queue<Integer> q = new LinkedList<>(); // BFS 탐색을 위한 큐

        q.add(R); // 시작 정점 R을 큐에 추가한다.
        visited[R] = true; // 시작 정점 R을 방문했음을 표시

        int visitOrder = 1; // 첫번째 방문이기 때문에 1로 시작
        order[R] = visitOrder++; // 첫번째 방문(1)이후 visitOrder 2로 세팅

        while(!q.isEmpty()){
            int node = q.poll();

            for(int next : graph.get(node)) { // 현재 정점에 인접한 모든 정점을 탐색
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                    order[next] = visitOrder++; // 방문 후 visitOrder 1씩 추가 //방문 순서를 ++해가면서 순서를 설정

                }
            }
        }

        // 방문한 정점을 출력 // order의 인덱스가 정점. 해당 정점을 몇번째에 방문했는지가 출력값
        for (int i=1; i<=N; i++) { // 5번 인덱스 까지 있기 때문에 '<='이다.
            if(i==N){
                bw.write(String.valueOf(order[i]));
            } else {
                bw.write(order[i] + "\n");
            }
        }
        bw.flush();
    }
}