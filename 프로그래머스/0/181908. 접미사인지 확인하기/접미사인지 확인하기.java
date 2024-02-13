class Solution {
    public int solution(String my_string, String is_suffix) {
		// 전체 문자열에서 부터 비교를 시작하여 앞에서 부터 하나씩 문자열을 잘라내 is_suffix 문자열의 값과 같은지 비교하기
//		for (int i = 0; i < my_string.length(); i++) {
//			if (my_string.substring(i, my_string.length()).equals(is_suffix)) {
//				return 1;
//			}
//		}
//
//		return 0;
		
		// endsWith() : 대상 문자열이 특정 문자나 문자열로 끝나는지 확인할 수 있는 함수. 
		// 해당 문자열로 끝나는지 확인하고 boolean에 맞춰 true/false 값을 리턴.
		// 주의할 점 - string을 작성할 때 공백도 인식을 하여 판단하니 공백에 유의해서 작성할 것.
		return (my_string.endsWith(is_suffix)) ? 1 : 0;
	}
}