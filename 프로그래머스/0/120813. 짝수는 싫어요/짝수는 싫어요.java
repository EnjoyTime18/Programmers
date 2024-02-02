class Solution {
    public int[] solution(int n) {
		
        int maxindex = 0; 
        
        // n의 변수 값 가지고 홀수의 배열 만들기
        // 먼저 정적 배열인 answer index 값 세팅을 위한 for
        for(int i=0; i<=n; i++) {
           if(i % 2 == 1) { //i가 홀수시 조건이 참이기 때문에 인덱스 값 하나씩 증가
        	   maxindex++;                
           }
        }
        
        int[] answer = new int[maxindex];
        int index = 0;
                
		for(int i = 0; i<=n; i++) { //answer.length; 이 아닌 i<=n; 으로 조건세팅*** n을 기준으로 계속 반복문이 돌아야 하기 떄문
			 if(i % 2 == 1) {
	                answer[index] = i;  
	                index++;
	           }
		}
        
        return answer;
	}
}