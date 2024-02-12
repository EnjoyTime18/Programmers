class Solution {
    public int solution(int n) {
		int total = 0;

		for (int i = 1; i <= n; i++) {
			if (n % 2 == 1) { // n이 홀수인 경우에만
				if (i % 2 == 1) { // i의 값이 홀수인 경우에만
					total += i;
				}
			} else { // n이 짝수인 경우에만
				if (i % 2 == 0) { // i의 값이 짝수인 경우에만
					total += Math.pow(i, 2);
				}
			}
		}

		return total;
	}
}