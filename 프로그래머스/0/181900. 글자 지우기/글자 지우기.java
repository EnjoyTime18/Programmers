import java.util.Arrays;

class Solution {
    	public String solution(String my_string, int[] indices) {
		// 방법1
//		char[] c = my_string.toCharArray();
//
//		for (int index : indices) {
//			c[index] = ' ';
//		}
//
//		return String.valueOf(c).replace(" ", "");

		// 방법2
//		String answer = "";
//		String[] tmp = my_string.split("");
//
//		for (int index : indices) {
//			tmp[index] = "";
//		}
//
//		for (String x : tmp) {
//			answer += x;
//		}
//		
//		return answer;

		// 방법3
		StringBuilder sb = new StringBuilder(my_string);
		Arrays.sort(indices);

		for (int i = 0; i < indices.length; ++i) {
			int index = indices[i];
			sb.deleteCharAt(index - i); // 삭제 할 때마다 문자열의 길이가 자동으로 줄어들기 때문에 - i 필수
		}

		return sb.toString();
	}
}