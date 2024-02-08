class Solution {
    public int solution(int n) {
		//Math.sqrt() -> 인자의 숫자를 넣으면 그 숫자가 어떤 숫자의 제곱인지 제곱근을 구해주는 수학 메소드. 즉, 특정값의 제곱근을 구함.
		//Math.sqrt(25) -> 25의 제곱근은 5이다. 해당 메소드는 반환타입이 double형 이므로 정수형으로 변환하려면 명시적 형변환 필수
		
		//정답1
		int m = (int) Math.sqrt(n); // 12, 31
		return n % m == 0 ? 1 : 2;

		//정답2
//		int a = (int) Math.sqrt(n);		
//		return (a * a) == n ? 1 : 2;

		// 아래 for문은 정답은 맞으나 비효율적 for문
//        for(int i=1; i<=n; i++) {
//        	if((i * i) == n) {
//        		return 1;
//        	}
//        }
//        
//        return 2;               
	}
}