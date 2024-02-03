class Solution {
    public int solution(int n) {
		
		int result = 0;

		for(int i=1; i<=n; i++) { 
			int num = 0; 
			
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					num++;
				}				
			}
			
			//안쪽 for문이 완전히 다 돌고 num 변수는 i가 6인 경우 약수의 개수가 1,2,3,6 총 4개이며 num 변수의 값도 4로 카운팅 되어야 하기 떄문에 조건을 >=로 지정.
			//절대 == 같다.라고 비교 연산자는 쓰면 안됨. 4 == 3 성립이 되지 않기 떄문에 result 값 증가가 안됨.
			//이 if문은 안쪽 for문이 거짓인 경우 안쪽 for문 빠져나오고(종료 되고) 해당 if문이 실행됨.
			if(num >= 3) {
				result++;
			}
			
			//if문 실행 후 바깥쪽 for문으로 이동. i의 값이 증가함.
		}
		
		return result;
			
    }
}