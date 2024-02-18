class Solution {
    public int solution(int[][] arr) {
		int answer = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				answer = (arr[row][column] == arr[column][row]) ? 1 : 0;
				if (answer == 0) {
					return 0;
				}
			}
		}

		return answer;
	}
}