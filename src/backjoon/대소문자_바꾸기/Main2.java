package backjoon.대소문자_바꾸기;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 문자열을 문자 배열로 변환
        char[] ans = str.toCharArray();

        for(int i = 0; i < ans.length; i++){
            // 만약 꺼내온 현재 문자가 소문자라면
            if('a' <= ans[i] && ans[i] <= 'z'){
//                'b' - 'a' = 1 -> 'A' + 1 -> 'B'
                ans[i] = (char)('A'+ans[i]-'a');
            }else{
//                만약 꺼내온 문자가 대문자라면
//                대문자를 소문자로 변환
                ans[i] = (char)('a'+ans[i]-'A');
            }
        }
        System.out.println(ans);
    }
}
