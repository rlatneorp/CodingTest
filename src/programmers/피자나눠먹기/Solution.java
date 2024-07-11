package programmers.피자나눠먹기;

class Solution {
    static int solution(int n) {
        int answer = 0;

        if(n % 7 > 0){
           answer =  n / 7 + 1;
        }
        if(n % 7 == 0){
            answer = n / 7;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(14));
    }
}