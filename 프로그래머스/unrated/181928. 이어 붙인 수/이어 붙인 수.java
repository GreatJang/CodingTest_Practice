class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";
        for(int i=0; i<num_list.length;i++){
            if(num_list[i]%2==1){
                a += Integer.toString(num_list[i]);
            }
            if(num_list[i]%2==0){
                b += Integer.toString(num_list[i]);
            }
        }
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}