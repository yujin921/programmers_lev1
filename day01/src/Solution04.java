import java.util.*;

public class Solution04 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(i==0 || arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }

        int answer[] = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

        // int[] answer = {};
        
        // for(int i=0; i<arr.length; i++) {
        //     // 배열의 길이가 1인 경우
        //     if(arr.length == 1) {
        //         answer = new int[]{arr[0]};
        //         return answer;
        //     }
        //     // 배열의 길이가 2 이상인 경우
        //     if(i == 0) {
        //         // 첫 번째 요소는 무조건 추가
        //         answer = new int[]{arr[i]};
        //     } else {
        //         // 이전 요소와 비교하여 중복되지 않는 경우에만 추가
        //         if(arr[i] != arr[i-1]) {
        //             answer = Arrays.copyOf(answer, answer.length + 1);
        //             answer[answer.length - 1] = arr[i];
        //         }
        //     }
        // }
        // // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        // return answer;
    }
}
