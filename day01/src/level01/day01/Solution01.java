package level01.day01;

class Solution01 {
    public int solution(int[] nums) {
        int answer = 0; // 종류의 갯수
        int pick = nums.length / 2; // 뽑아야 하는 폰켓몬 수

        for (int i = 0; i < nums.length; i++) {
            boolean isNew = true;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isNew = false;
                    break;
                }
            }
            if (isNew) {
                answer++;
            }
        }
        return answer > pick ? pick : answer;
    }
}

