import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public int solution(int[] numbers) {
		
		int max1 = 0;
		int max2 = 0;
		int maxindex = 0;
		
		Arrays.sort(numbers); //먼저 주어진 numbers 배열에서 최대 값 찾기 쉽게 오름차순으로 배열을 정렬해주는 작업
		
// 		List<Integer> intList = new ArrayList<>();        
// 		for (int element : numbers) { // numbers 배열 요소들 순차적으로 ArrayList 배열에 요소 추가
// 			intList.add(element);        
// 		}
				
// 		for(int i=0; i<intList.size(); i++) { // 첫번째 최대값 배열 요소 탐색
// 			if(intList.get(i) > max1) {
// 				max1 = intList.get(i);
// 				maxindex = i;
// 			}
// 		}
		
// 		intList.remove(maxindex); // 첫번째 최대값 알아냈으니 두번째 최대값 찾기 위해 첫번째 최대값 배열에서 제거
		
// 		for(int i=0; i<intList.size(); i++) { // 두번째 최대값 배열 요소 탐색
// 			if(intList.get(i) > max2) {
// 				max2 = intList.get(i);
// 			}
// 		}
		
// 		return max1 * max2;
        
        int firstMaxValue = numbers[numbers.length - 1];
        int secondMaxValue = numbers[numbers.length - 2];

        return firstMaxValue * secondMaxValue;
	}
}