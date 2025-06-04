
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>(); 
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        list.sort(null); // 오름차순 정렬
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++){
            answer[i] = list.get(i); // 리스트의 원소를 배열에 넣기
        }
        return answer;
    }
}