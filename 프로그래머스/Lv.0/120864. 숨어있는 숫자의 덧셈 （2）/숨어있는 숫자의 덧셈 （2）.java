class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String a = my_string.replaceAll("[A-Za-z]"," ");
        String[] stArr = a.split(" ");
        for(int i=0; i<stArr.length; i++){
            if(!(stArr[i].equals(""))){
                answer +=Integer.parseInt(stArr[i]);
            }
        }
        return answer;
    }
}