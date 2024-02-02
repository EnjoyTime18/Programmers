import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        //배열의 길이가 홀수라는 조건이 있으므로 짝수는 구려하지 않는다.
        //중앙값은 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값이다. 
        //Arrays.sort() 메서드로 array를 오름차순으로 정렬한 뒤 length / 2 로 중앙값을 찾았다.
        
       	int result = 0;	
        
		Arrays.sort(array); 		
		result = array[array.length / 2]; //나누기한 계산결과인 몫이 배열의 중앙값으로 접근하는 인덱스의 값이 됨.
		
		return result;        
    }
}