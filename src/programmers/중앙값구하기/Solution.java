package programmers.중앙값구하기;

//https://school.programmers.co.kr/learn/courses/30/lessons/120811

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int midIndex = array.length / 2;

        return array[midIndex];
    }
}