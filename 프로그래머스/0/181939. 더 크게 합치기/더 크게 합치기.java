class Solution {
    public int solution(int a, int b) {
		String s1 = ""; 
		String s2 = ""; 
		
		s1 += String.valueOf(a);
		s1 += String.valueOf(b);
		s2 += String.valueOf(b);
		s2 += String.valueOf(a);

		if (Integer.parseInt(s1) > Integer.parseInt(s2)) {
			return Integer.parseInt(s1);
		} else if (Integer.parseInt(s1) < Integer.parseInt(s2)) {
			return Integer.parseInt(s2);
		} else {
			return Integer.parseInt(s1);
		}
	}
}