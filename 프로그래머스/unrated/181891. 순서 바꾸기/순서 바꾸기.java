class Solution {
    public int[] solution(int[] num_list, int n) {
        String a="";
        String b="";
        int[] answer = new int[num_list.length];
            for(int i=n; i<num_list.length; i++){
                a += Integer.toString(num_list[i]);
            }
            for(int i=0; i<n; i++){
                b += Integer.toString(num_list[i]);
            }
            String c = a+b;
            char[] d = c.toCharArray();
            for(int i=0; i<c.length(); i++){
                answer[i]=Integer.parseInt(String.valueOf(d[i]));
            }
        return answer;
    }
}