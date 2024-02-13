class Solution {
    public int solution(int[] num_list) {
		int total = 0;

		for (int i = 0; i < 1; i++) {
			total = num_list[i];
			for (int j = 1; j < num_list.length; j++) { // 1~4
				if (num_list.length >= 11) {
					total += num_list[j];
				} else {
					total *= num_list[j];
				}
			}
		}

		return total;
	}
}