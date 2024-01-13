class Solution {
    public int solution(int[] array) {
        String answer = "";
        int count =0;
        for (int i = 0; i < array.length; i++) {
            answer += Integer.toString(array[i]);
        }
        for(int i=0; i<answer.length(); i++){
            if(String.valueOf(answer.charAt(i)).equals("7")){
                count ++;
            }
        }
        return count;
    }
}