class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length]; // arr 배열 선언(길이:numlist.length)
        int count = 0;
        
        for(int i = 0; i<numlist.length; i++){ // i부터 numlist.length까지 for문
            if(numlist[i]%n == 0){ // 만약 numllist원소가 n의 배수이면
                arr[count] = numlist[i]; // arr[count] 위치에 numlist[i]값으로 초기화
                count++; // count 1증가
            }
        } // 결국 numlist배열의 원소 중 n의 배수인 원소는 arr배열에 넣는다.
        int[] answer = new int[count]; // answer 배열 선언(길이:count)
        for(int i = 0; i<count; i++){ // i부터 count까지 for문
            answer[i] = arr[i]; // 
        } // arr배열을 answer배열에 넣어주는 이유는 arr배열의 길이가 원소의 갯수(numlist.length)로 세팅되어 있기 때문에 결괏값이 크게나온다. 그렇기 때문에 answer 배열의 길이를 실제 결과 값인 count 갯수로 세팅하여 원하는 결괏값을 얻는다.
        return answer;
    }
}

// class Solution {
//     public int[] solution(int n, int[] numlist) {
//         int[] answer = {numlist.length};
//         for(int i=0; i<numlist.length; i++){
//             for(int a=1; a<100000; a++){
//                 if(numlist[i] == n*a){
//                     answer += new int[]{numlist[i]};
//                 }
//             }
//         }
//         return answer;
//     }
// }