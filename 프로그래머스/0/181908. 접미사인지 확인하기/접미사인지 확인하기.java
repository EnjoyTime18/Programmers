class Solution {
    public int solution(String my_string, String is_suffix) {
		// 전체 문자열에서 부터 비교를 시작하여 앞에서 부터 하나씩 문자열을 잘라내 is_suffix 문자열의 값과 같은지 비교하기
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.substring(i, my_string.length()).equals(is_suffix)) {
				return 1;
			}
		}

		return 0;
	}
}