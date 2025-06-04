class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i<=n;i++){
            if(isprime(i)){
                answer++; 
            }
        }
        return answer;
    }

    private boolean isprime(int n) {
        if(n < 2) return false; // 1은 소수 아님
        for (int i = 2; i <= Math.sqrt(n); i++) { // n의 제곱근까지만 검사
            if (n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        return true; // 소수인 경우
    }
}