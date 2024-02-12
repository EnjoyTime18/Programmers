class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
		char[] c = my_string.toCharArray();

		// 이번 문제 핵심 변수*** overwrite_string 문자열 길이의 값이 결국 7인데
		// 시작 인덱스인 s값을 기준으로 7번을 반복을 해야 된다. s값에 길이를 더 해주면 s값에서 7번이나 반복을 할 수 있는 범위를 구할 수 있다.
		// ex ) s = 2 , n = 9 --> 2~9 까지 7번 반복
		int n = s + overwrite_string.length();

		int index = 0; // overwrite_string 문자열에서 char 값을 하나씩 변환하여 꺼내오기 위한 변수

		// (i < n) -> (2~9), (7~14)
		for (int i = s; i < n; i++) {
			c[i] = overwrite_string.charAt(index);
			index++;
		}

		return String.valueOf(c);
	}
}