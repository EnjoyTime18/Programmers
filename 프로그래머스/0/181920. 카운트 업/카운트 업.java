class Solution {
    public int[] solution(int start_num, int end_num) {
		int index = 0;
		for (int i = start_num; i <= end_num; i++) {
			index++;
		}

		int[] answer = new int[index];
		int indx = 0;
		for (int i = start_num; i <= end_num; i++) {
			answer[indx] = i;
			indx++;
		}

		return answer;
	}
}