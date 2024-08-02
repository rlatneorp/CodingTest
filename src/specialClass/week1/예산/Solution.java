package specialClass.week1.예산;

import java.util.Arrays;
//https://campus.programmers.co.kr/tryouts/138978/challenges

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget >= 0) {
                answer++;
            }
        }
        return answer;
    }
}