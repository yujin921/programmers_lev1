class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 0) {
            // 짝수 길이인 경우
            //substring은 시작 인덱스 포함, 끝 인덱스 제외, 문자열 나옴
            answer = s.substring(length/2 -1, length/2 +1);
        } else {
            // 홀수 길이인 경우
            // charAt은 해당 인덱스의 문자 하나를 가져옴 단, char라 valueOf로 String으로 변환
            answer = String.valueOf(s.charAt(length / 2));
        }
        return answer;
    }
}