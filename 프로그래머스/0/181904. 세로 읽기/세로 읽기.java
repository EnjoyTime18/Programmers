class Solution {
    public String solution(String my_string, int m, int c) {
		String answer = "";
//		int midex = m;  

		for (int i = 0; i < my_string.length(); i += m) { // (i += m)에서 m 값이 바뀌지 않고 4로 계속 유지하는게 포인트
//			answer += my_string.substring(i, midex).charAt(c - 1);			
//			midex += m; // 전체 문자열에서 substring()로 인해 앞에서 부터 4글자씩 잘라야 하기 떄문에 끊어야할 끝 index는 4씩 계속 누적 증가해야 함.
			
			answer += my_string.substring(i, i + m).charAt(c - 1);
		}

		return answer;
	}
}