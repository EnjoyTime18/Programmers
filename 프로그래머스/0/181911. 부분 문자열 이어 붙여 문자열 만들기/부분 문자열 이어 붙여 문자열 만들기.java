class Solution {
    public String solution(String[] my_strings, int[][] parts) {
		String answer = "";

        // int[][] parts : 4 X 2 구조의 2차원 배열
		for (int i = 0; i < my_strings.length; i++) {
			int startindex = parts[i][0]; // [0][0], [1][0], [2][0], [3][0]
			int lastindex = parts[i][1];  // [0][1], [1][1], [2][1], [3][1]

			for (int str = startindex; str <= lastindex; str++) {
				answer += my_strings[i].charAt(str);
			}
		}

		return answer;
	}
}