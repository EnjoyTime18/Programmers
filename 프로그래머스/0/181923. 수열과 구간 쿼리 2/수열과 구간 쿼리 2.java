import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
		ArrayList<Integer> answer = new ArrayList<Integer>();

		for (int[] query : queries) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = query[0]; i <= query[1]; i++) {
				if (arr[i] > query[2]) {
					list.add(arr[i]);
				}
			}

			if (!list.isEmpty()) {
				Collections.sort(list);
				answer.add(list.get(0));
			} else {
				answer.add(-1);
			}

		}

		int[] result = new int[answer.size()];
		
		for (int i = 0; i < answer.size(); i++) {
			result[i] = answer.get(i);
		}

		return result;
	}
}