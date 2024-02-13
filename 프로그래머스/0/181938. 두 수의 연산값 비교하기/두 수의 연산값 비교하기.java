class Solution {
    public int solution(int a, int b) {
		String s = String.valueOf(a) + String.valueOf(b);
		int n = 2 * a * b;

//		if (Integer.parseInt(s) < n) {
//			return n;
//		} else {
//			return Integer.parseInt(s);
//		}
		
		return (Integer.parseInt(s) < n) ? n : Integer.parseInt(s);
	}
}