class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            int temp =a;
            a = b; // a가 b보다 크면 두 값을 바꿈
            b = temp; // a와 b의 값을 바꿈
        }
        for(int i= a; i<=b; i++){
            answer += i; // a부터 b까지의 합을 구함
        }
        return answer;
    }
}