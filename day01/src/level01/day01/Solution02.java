class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int[] monthdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for(int i=0; i<a-1;i++){ //전월달까지 더하기기
            totalDays += monthdays[i];
        }
        totalDays += b -1; //이번달 날짜 더하기 이때 -1을 하는 이유는 1일이 시작이기 때문에
        answer = week[totalDays % 7]; //요일 계산
        return answer;
    }
}