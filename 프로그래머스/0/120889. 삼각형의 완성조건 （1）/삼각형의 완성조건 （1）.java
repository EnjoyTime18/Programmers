import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
		
        Arrays.sort(sides); // 배열의 길이가 3이라는 조건이 있기 때문에 최대값 요소를 쉽게 알기 위해 오름차순으로 정렬
        
        int result = 0;
        int maxint = sides[sides.length -1]; // 배열의 요소들 중 최대 리터럴 값 반환
        
        //이중 for문을 이용해 배열에서 나머지 2개의 요소를 한번에 꺼내오기 위해 모든 for문은 각각 한번만 실행
        for(int i=0; i<1; i++) {
        	for(int j=1; j<2; j++) {
        		if(sides[i] + sides[j] <= maxint) {
        			result = 2;
        		} else {
        			result = 1;
        		}
        	}
        }
                       
        return result;
        //또 다른 방법은, 반복문 사용하지 않고 이미 베열 길이가 주어져있고 정렬만 되어있다면 다이렉트로 요소들 꺼내서 if문으로 검증해도 됨.
    }
}