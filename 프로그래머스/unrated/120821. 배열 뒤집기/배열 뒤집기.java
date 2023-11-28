class Solution {
    public int[] solution(int[] num_list) {
        for(int i=0, j=num_list.length-1; i<j; i++,j--) {
            int temp = num_list[i];
            num_list[i] = num_list[j];
            num_list[j] = temp;
        }
        //int[] answer = {};
        return num_list;
    }
}