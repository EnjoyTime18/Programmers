import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == true) {
				for (int a = 0; a < arr[i] * 2; a++) {
					list.add(arr[i]);
				}
			} else {
				for (int r = 0; r < arr[i]; r++) {
					list.remove(list.size() - 1);
				}
			}
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}