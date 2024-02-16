class Solution {
    public String solution(String n_str) {
		int index = 0;
		for (int i = 0; i < n_str.length(); i++) { // 핵심!! 문자열에서 0이 아닐 때 그 인덱스를 기준으로 문자열을 잘라야 하니까 substring() 인자값에 들어갈 인덱스 값 구하기
			if (n_str.charAt(i) != '0') {
				index = i;
				break; // 0이 아니라면 해당 인덱스를 기준으로 자르면 되기 때문에 반복문이 계속 수행되어서는 안됨.
			}
		}

		return n_str.substring(index);
	}
}