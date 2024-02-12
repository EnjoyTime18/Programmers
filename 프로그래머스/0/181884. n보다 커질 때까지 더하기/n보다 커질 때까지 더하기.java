class Solution {
    public int solution(int[] numbers, int n) {
		int total = 0;

		for (int num : numbers) {
			total += num;
			if (total > n) {
				break;
			}
		}

		return total;
	}
}