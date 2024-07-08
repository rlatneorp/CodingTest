package specialClass.week2.올바른괄호;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> q = new ArrayDeque<>();
        char c = 0;
       // for 반복문을 돌려서 문자 하나하나에 접근한다

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                q.push(c);
            }
            if (c == ')'){
                if(q.isEmpty()){
                    return false;
                }
                q.pop();
            }
        }
        // 열린 괄호면
            // 스택에 넣어준다
        // 닫힌 괄호면
            // 스택 팝()
        // s.isEmpty()
        answer = q.isEmpty();
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "(())()";
        boolean result = s.solution(s1);
        System.out.println(result);
    }
}
