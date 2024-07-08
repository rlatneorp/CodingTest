package week2.dailyTemperatures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {
     public int[] solution(int[] temps) {
         int[] ans = new int[temps.length];
         Deque<Integer> stack = new ArrayDeque<>();
         // 반복문이 2개라고 n^2은 아니다
         // while문은 stack에 쌓여있는 데이터 갯수만큼만 실행가능하다
         // 각 stack에 한 번씩만 들어갈 수 있다. 그래서 for문이 다 돌때까지 총 n번만 가능
         // 굳이 말하면 시간복잡도에선 2n이 된다
         for (int day = 0; day < temps.length; day++){
             while(!stack.isEmpty() && temps[stack.peek()] < temps[day]){
                 int prevDay = stack.pop();
                 ans[prevDay] = day - prevDay;
             }
             stack.push(day);
         }
         return ans;
     }
}
