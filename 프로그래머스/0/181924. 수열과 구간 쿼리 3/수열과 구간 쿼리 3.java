class Solution {
    public int[] solution(int[] arr, int[][] queries) {
		for (int row = 0; row < queries.length; row++) {
//			int lt = queries[row][0];
//			int rt = queries[row][1];
//			
//			int tmp = arr[lt];
//
//			arr[lt] = arr[rt];
//			arr[rt] = tmp;
			
			int one = arr[queries[row][0]];
            int two = arr[queries[row][1]];

            arr[queries[row][0]] = two;
            arr[queries[row][1]] = one;
		}

		return arr;
	}
}