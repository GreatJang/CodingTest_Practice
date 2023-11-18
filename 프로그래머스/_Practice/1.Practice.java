// 프로그래머스 점의 위치 구하기

// 첫번째 풀이(정답 X 분홍색 중괄호애서 막힘)
class Solution {
    public int solution(int[] dot) {
        
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        } if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        } if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
    }
}

// 두번째 풀이 정답.
class Solution {
    public int solution(int[] dot) {
        
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}

// 다른 사람 풀이 참조 풀이
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }   return answer;
    }
}