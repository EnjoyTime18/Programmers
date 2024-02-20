class Solution {
    public String solution(String myString, String pat) {		
		if (pat.length() > 1) {
			String s = String.valueOf(pat.charAt(pat.length() - 1));
			return myString.substring(0, myString.lastIndexOf(s) + 1);
		} else {
			return myString.substring(0, myString.lastIndexOf(pat) + 1);
		}
	}
}