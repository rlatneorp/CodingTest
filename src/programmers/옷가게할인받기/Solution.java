package programmers.옷가게할인받기;

//https://school.programmers.co.kr/learn/courses/30/lessons/120818

class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000){
            answer = (int) (price - price * 0.05);
        }
        if (price >= 300000){
            answer = (int) (price - price * 0.15);
        }
        return answer;
    }
}