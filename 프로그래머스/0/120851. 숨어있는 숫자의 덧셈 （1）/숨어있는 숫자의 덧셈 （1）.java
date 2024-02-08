class Solution {
    public int solution(String my_string) {
		int total = 0;

		for (int i = 0; i < my_string.length(); i++) {
			if(Character.isDigit(my_string.charAt(i))) {
				total += Character.getNumericValue(my_string.charAt(i));
			}
		}

		return total;
	}
}