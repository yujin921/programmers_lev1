import java.util.List;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        List<String> list = List.of(seoul);
        int num = list.indexOf("Kim");

        answer = "김서방은 "+num+"에 있다";
        return answer;
    }
}