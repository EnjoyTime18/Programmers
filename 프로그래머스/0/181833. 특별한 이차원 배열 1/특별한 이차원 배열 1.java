class Solution {
    public int[][] solution(int n) {
		int[][] answer = new int[n][n];

		for (int row = 0; row < answer.length; row++) {
			for (int column = 0; column < answer[row].length; column++) {
				if (row == column) {
					answer[row][column] = 1;
				} else {
					answer[row][column] = 0;
				}
			}
		}

		return answer;
	}
}