package programmers.짝수홀수개수;

//https://school.programmers.co.kr/learn/courses/30/lessons/120824

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                answer[0]++;
            }
            if(num_list[i] % 2 > 0){
                answer[1]++;
            }
        }
        return answer;
    }
}
