import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int n : arr) {
			list.add(n);
		}
				
		// 삭제할 요소를 포함하고 있는지 확인하고, 포함된다면 삭제합니다.
        for (int j : delete_list) {
            list.removeIf(value -> value == j);
        }

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}
}