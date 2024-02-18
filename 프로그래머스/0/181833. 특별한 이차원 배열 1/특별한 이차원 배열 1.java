class Solution {
    public int[][] solution(int n) {
		int[][] answer = new int[n][n];

		for (int row = 0; row < answer.length; row++) {
			for (int column = 0; column < answer[row].length; column++) {
				answer[row][column] = (row == column) ? 1 : 0;
			}
		}

		return answer;
	}
}