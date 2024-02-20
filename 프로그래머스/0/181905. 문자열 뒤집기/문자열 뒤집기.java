class Solution {
    public String solution(String my_string, int s, int e) {
		char[] c = my_string.toCharArray();
		
		for (int i = s; i <= e; i++) {
			char tmp = c[i];

			c[i] = c[e];
			c[e] = tmp;
			e--;
		}

		return String.valueOf(c);
	}
}