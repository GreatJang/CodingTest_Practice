class Solution {
    static boolean[] visited;
    static int[][] graph;
    static int count;
    
    public int solution(int n, int[][] computers) {
        graph = computers;
        visited = new boolean[n];
        for(int i=0; i<n; i++){
        if(visited[i] == false){
                dfs(i);
            }
        }
        return n-count;
    }
    
        static void dfs(int start) { // 간선의 갯수 count로 세기
        visited[start] = true;
        for(int i=0; i<graph.length; i++){
            if(visited[i] == false && graph[start][i] == 1){
                count ++;
                dfs(i);
                }
            }
        }
}