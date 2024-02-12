class Solution {
    public int solution(int a, int b) {		
		String s1 = String.valueOf(a) + String.valueOf(b); // 문자 + 문자 = 문자를 연결해준다.
		String s2 = String.valueOf(b) + String.valueOf(a);

		if (Integer.parseInt(s1) > Integer.parseInt(s2)) {
			return Integer.parseInt(s1);
		} else if (Integer.parseInt(s1) < Integer.parseInt(s2)) {
			return Integer.parseInt(s2);
		} else {
			return Integer.parseInt(s1);
		}
	}
}