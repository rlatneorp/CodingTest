package programmers.배열두배만들기;

//  https://school.programmers.co.kr/learn/courses/30/lessons/120809

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}