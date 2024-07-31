package specialClass.week1.연속된_부분수열의_합;

//https://campus.programmers.co.kr/tryouts/138979/challenges

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, 1_000_000};
        int total = 0;
        int start = 0;

        for (int end = 0; end < sequence.length; end++) {
            total += sequence[end];
            while (total > k) {
                total -= sequence[start];
                start++;
            }

            if (total == k) {
                if ((end - start) < (answer[1] - answer[0])) {
                    answer[0] = start;
                    answer[1] = end;
                }
            }
        }
        return answer;
    }
}