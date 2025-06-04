class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        try{
            Integer.parseInt(s);
            if(s.length() == 4 || s.length() == 6){
                answer = true;
            }else{
                answer = false; // 길이가 4 또는 6이 아니면 false
            }
        }catch(NumberFormatException e){
            answer = false; // 숫자로 변환할 수 없으면 false
        }
        return answer;
    }
}
