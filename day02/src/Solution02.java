import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2); // 사전순 정렬
                }
                return s1.charAt(n) - s2.charAt(n); // n번째 문자 기준 정렬
            }
        });
        return strings;
    }
}