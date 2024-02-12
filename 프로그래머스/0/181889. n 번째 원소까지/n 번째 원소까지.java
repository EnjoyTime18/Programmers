class Solution {
    public int[] solution(int[] num_list, int n) {
		int index = 0;
		for (int i = 0; i < n; i++) {
			index++;
		}

		int[] num = new int[index];
		int indx = 0;
		for (int i = 0; i < n; i++) {
			num[indx] = num_list[i];
			indx++;
		}

		return num;
	}
}