class Solution {
    public int[] solution(int[] arr, int[][] queries) {
		for (int row = 0; row < queries.length; row++) {
			for (int i = queries[row][0]; i <= queries[row][1]; i++) {
				arr[i] = arr[i] + 1;
			}
		}

		return arr;
	}
}