class Solution {
    public int solution(int[] num_list) {
//		int mult = 0;
//		for (int i = 0; i < 1; i++) {
//			mult = num_list[i];
//			for (int j = 1; j < num_list.length; j++) {
//				mult *= num_list[j];
//			}
//		}
//
//		int total = 0;
//		for (int n : num_list) {
//			total += n;
//		}

		int total = 0;
		int mult = 1;

		for (int i : num_list) {
			total += i;
			mult *= i;
		}

		return (mult < Math.pow(total, 2)) ? 1 : 0;
	}
}