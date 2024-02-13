class Solution {
    public int solution(String my_string, String is_prefix) {
		// 전체 문자열에서 첫번째 문자 인덱스 0를 기준으로 앞에서 부터 하나씩 문자열을 포함시켜 is_suffix 문자열의 값과 같은지 비교하기
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.substring(0, i).equals(is_prefix)) {
				return 1;
			}
		}

		return 0;

		// startsWith() : 대상 문자열이 특정 문자나 문자열로 시작하는지 확인할 수 있는 함수. 
		// 해당 문자열로 시작되는지 확인하고 boolean에 맞춰 true/false값을 리턴.
		// 주의할 점 - string을 작성할 때 공백도 인식을 하여 판단하니 공백에 유의해서 작성할 것.
//		return my_string.startsWith(is_prefix) ? 1 : 0;

		// 문자열과 관련된 함수 중에서 문자 중에서 해당 내용이 포함되어 있는지를 확인하는 메서드
		// startsWith : 문자열의 시작에 원하는 문자가 있는지 확인하는 메서드
		// endsWith : 문자열의 끝에 원하는 문자가 있는지 확인하는 메서드
		// contains : 문자열 안에 원하는 문자가 있는지 확인하는 메서드
	}
}