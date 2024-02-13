class Solution {
    public int solution(int n, String control) {
		for (int i = 0; i < control.length(); i++) {
			if (String.valueOf(control.charAt(i)).equals("w")) {
				n++;
			} else if (String.valueOf(control.charAt(i)).equals("s")) {
				n--;
			} else if (String.valueOf(control.charAt(i)).equals("d")) {
				n += 10;
			} else {
				n -= 10;
			}
		}	

		return n;
	}
}