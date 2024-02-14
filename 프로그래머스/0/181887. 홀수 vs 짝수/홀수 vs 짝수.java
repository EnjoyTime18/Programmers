class Solution {
    public int solution(int[] num_list) {
		int odd = 0;
		int ever = 0;

		for (int i = 0; i < num_list.length; i++) {
			int n = num_list[i];
			if ((i + 1) % 2 == 1) {
				odd += n;
			} else {
				ever += n;
			}
		}

		if (odd > ever) {
			return odd;
		} else {
			return ever;
		} 		
	}
}