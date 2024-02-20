class Solution {
    public String solution(String my_string, int[] indices) {
		char[] c = my_string.toCharArray();

		for (int index : indices) {
			c[index] = ' ';
		}

		return String.valueOf(c).replace(" ", "");
	}
}