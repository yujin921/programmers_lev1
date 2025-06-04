class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase(); // 대소문자 구분 없이 처리하기 위해 소문자로 변환
        int pcount = 0; 
        int ycount = 0; 
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                pcount++; // 'p'의 개수 세기
            } else if(s.charAt(i) == 'y'){
                ycount++; // 'y'의 개수 세기
            }
        }

        if(pcount == ycount){ // 'p'와 'y'의 개수가 같으면 true
            answer = true;
        } else { // 다르면 false
            answer = false;
        }
        return answer;
    }
}