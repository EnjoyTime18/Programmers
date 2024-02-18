class Solution {
    public int solution(String binomial) {
		String s = binomial.replace(" ", "");

		if (s.contains("+")) {
			return Integer.parseInt(s.split("\\+")[0]) + Integer.parseInt(s.split("\\+")[1]);
		} else if (s.contains("-")) {
			return Integer.parseInt(s.split("\\-")[0]) - Integer.parseInt(s.split("\\-")[1]);
		} else {
			return Integer.parseInt(s.split("\\*")[0]) * Integer.parseInt(s.split("\\*")[1]);
		}
		
	}
}