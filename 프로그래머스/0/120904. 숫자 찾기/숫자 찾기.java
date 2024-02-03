class Solution {
    public int solution(int num, int k) {
		//int형을 String 타입으로 변환하는 방법
		//방법1
		String s = String.valueOf(num); // "29183"
		//방법2     
 //     String s = Integer.toString(num);
		
		for(int i=0; i<s.length(); i++) {
			if(Character.getNumericValue(s.charAt(i)) == k) {
				return i + 1;
			}	
			
			//절대 주의! 이 for문은 계속 돌면서 조건이 참이면 양수를 리턴해야 하기 때문에 중간에 else나 밑에 다 return을 해버리면 계속 돌지도 못하고 -1이 리턴되고 바로 for문이 종료됨. 
//			return -1;
		}
		
		//for문 완전히 끝나고 조건이 완전한 거짓일 경우 -1 리턴하고 solution 메소드 종료
		return -1;
		
    }
}