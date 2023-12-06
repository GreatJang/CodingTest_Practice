class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 주어진 수 n을 자릿수마다 나눠서 더합니다.
        while (n > 0) {
            answer += n % 10;  // 현재 자릿수의 숫자를 더함
            n /= 10;           // 다음 자릿수로 이동
        }
        
        return answer;
    }
}
// class Solution {
//     public int solution(int n) {
//         int answer=0;
//         for (int a = 100000; a==10; a %=10){
//             answer = answer + (n / a);
//         }
//         return answer;
//     }
// }

//         // int a = n / 1000;
//         // int b = n - (a*1000);
//         // int c = b / 100;
//         // int d = b - (c*100);
        
//         // return (n / 100000)
//         //     + (n / 10000)
//         //     + (n / 1000)
//         //     + (n / 100)
//         //     + (n / 10)
//         //     + (n / 1);