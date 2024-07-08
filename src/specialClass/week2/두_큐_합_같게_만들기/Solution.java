package specialClass.week2.두_큐_합_같게_만들기;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int solution(int[] queue1, int[] queue2){
        int n = queue1.length; // queue2의 length와 똑같음

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        int q1Sum = 0;
        int q2Sum = 0;

        for(int value : queue1) {
            q1.add(value);
            q1Sum += value;
        }
        for(int value : queue2) {
            q2.add(value);
            q2Sum += value;
        }

        // 처음부터 끝가지 돌 때 처음으로 돌아오는 횟수가 4번이라 4n
        for (int i = 0; i < 4*n; i++){
            if (q1Sum > q2Sum) {
                int value = q1.remove(); // q1에서 뺀 수
                q2.add(value); // q2에 q2을 뺀 걸 더한다
                q1Sum -= value; // 빠진 수로 바꾼다
                q2Sum += value; // 더해진 수로 바뀐다
            }
            if (q1Sum < q2Sum) {
                int value = q2.remove();
                q1.add(value);
                q2Sum -= value;
                q1Sum += value;
            }
            if (q1Sum == q2Sum) {
                return i; // 몇번 돈지 횟수
            }
        }
        return -1; // 구현이 되지 않으면 -1 리턴
    }

}
