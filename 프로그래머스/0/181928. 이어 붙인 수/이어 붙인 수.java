class Solution {
    public int solution(int[] num_list) {
		String odd = "";  // 홀수인 경우 해당 숫자 문자열화 시켜 값 누적시키기
        String even = ""; // 짝수도 위와 동일      
        
        for(int n : num_list) {
        	if(n % 2 == 0) {
        		even += String.valueOf(n);
        	} else {
        		odd += String.valueOf(n);
        	}
        }
                
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}