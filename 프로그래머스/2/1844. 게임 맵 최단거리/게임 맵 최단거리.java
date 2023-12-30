import java.util.*;

class Solution {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;

    public int solution(int[][] maps) {
        int m = maps.length; // 이중 배열의 길이
        int n = maps[0].length; // 이중 배열의 한 요소의 길이
        visited = new boolean[m*n]; // 방문한 노드는 visited를 true로 설정. // 노드 25개
        adjList = new ArrayList<>();
        distance = new int[m*n]; // distance int배열 선언 및 초기화
        
        for (int i = 0; i < m*n; i++) {
            adjList.add(new ArrayList<>());
        }
        Arrays.fill(distance,1);

        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
                if(maps[i][j]==0) continue;
                int[] dx = {-1, 1, 0, 0};
                int[] dy = {0, 0, -1, 1};
                for (int d = 0; d < 4; d++) {
                    int target_i = i + dx[d];
                    int target_j = j + dy[d];
                    if (target_i >= 0 && target_i < m && target_j >= 0 && target_j < n
                        && maps[target_i][target_j]==1) {
                        addEdge(i * n + j, target_i * n + target_j); // a는 내가 갈곳 // b는 인접노드
                    }
                }
            }
        }
        return bfs(0, m*n-1);
    }

    static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) { // 자주쓰이기 때문에 코드 외우기
            int next = queue.poll(); // 방문
            for (int target : adjList.get(next)) { // next에 근접해 있는 숫자들을 target으로 가져옴
                if (visited[target] != true) { // 가져온 target이 true가 아닌경우에 queue에 target을 add // true이면 queue에 추가 안됌.
                    queue.add(target); //queue에 담았을때 바로 visited 를 true로 바꿔야 한다.
                    distance[target] = distance[next] + 1;
                    visited[target] = true; //queue에 넣기전에 visited를 true로 바꾸어주면 queue에 중복되서 값이 들어갈 수 있기때문에
                    if (target == end) {
                        return distance[end];
                    }
                }
            }
        }
        return -1;
    }
        static void addEdge(int a, int b) {
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }
}