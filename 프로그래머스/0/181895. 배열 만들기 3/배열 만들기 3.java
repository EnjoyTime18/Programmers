import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < intervals.length; i++) {
			int startindex = 0;
			int lastindex = 0;

			startindex = intervals[i][0];
			lastindex = (intervals[i][1]) + 1;

			for (int n : Arrays.copyOfRange(arr, startindex, lastindex)) {
				list.add(n);
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;
	}
}