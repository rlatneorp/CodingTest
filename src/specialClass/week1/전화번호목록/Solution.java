package specialClass.week1.전화번호목록;

//https://campus.programmers.co.kr/app/courses/24217/curriculum/lessons/322799#part-71107

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 1; i++) {
            if((phone_book[i + 1]).startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
