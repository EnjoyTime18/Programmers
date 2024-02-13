class Solution {
    public int[] solution(int start, int end_num) {
		int index = 0;
		for (int i = start; i >= end_num; i--) { // 10이 3보다 크거나 같을때까지 반복 .. 9가 3보다 크거나 같을때까지 반복.. .. ..
			index++;
		}
		
		int[] result = new int[index];
		int arrayindx = 0;
		for (int i = start; i >= end_num; i--) {
			result[arrayindx] = i;
			arrayindx++;
		}

		return result;
	}
}