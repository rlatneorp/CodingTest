package backjoon.대소문자_바꾸기;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch + 32);
            } else if(ch >= 'a' && ch <= 'z'){
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }

        System.out.println(result.toString());
    }
}