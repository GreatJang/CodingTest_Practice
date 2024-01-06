class Solution {
    public int solution(int n, String control) {
        for(int i=0; i<control.length(); i++){
            String a = String.valueOf(control.charAt(i));
            if(a.equals("w")){
                n +=1;
            }
            else if(a.equals("s")){
                n -=1;
            }
            else if(a.equals("d")){
                n +=10;
            }
            else if(a.equals("a")){
                n -=10;
            }
        }
        return n;
    }
}