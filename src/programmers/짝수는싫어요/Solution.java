package programmers.짝수는싫어요;

//https://school.programmers.co.kr/learn/courses/30/lessons/120813

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}