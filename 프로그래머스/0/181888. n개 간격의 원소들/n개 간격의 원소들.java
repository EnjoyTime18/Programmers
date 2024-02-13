class Solution {
    public int[] solution(int[] num_list, int n) {
		int index = 0;
		for (int i = 0; i < num_list.length; i = i + n) {
			index++;
		}

		int[] answer = new int[index];
		int indx = 0;
		for (int i = 0; i < num_list.length; i = i + n) {
			answer[indx] = num_list[i];
			indx++;
		}

		return answer;
	}
}