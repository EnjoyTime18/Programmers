class Solution {
    public int solution(int[][] arr) {
		int answer = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				if (arr[row][column] == arr[column][row]) {
					answer = 1;
				} else {
					return 0;
				}
			}
		}

		return answer;
	}
}