import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {			
			for (int j = 1; j <= arr[i]; j++) {
				list.add(arr[i]);
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}
}