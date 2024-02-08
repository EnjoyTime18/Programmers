class Solution {
    public int solution(int n) {
		int total = 0;
		
		String s = Integer.toString(n);
//		String s = String.valueOf(n);
		
		for(int i=0; i<s.length(); i++) {
			total += Character.getNumericValue(s.charAt(i));
		}
		
		return total;
	}
}