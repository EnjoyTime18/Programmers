import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < intStrs.length; i++) {
			if (Integer.parseInt(intStrs[i].substring(s, l + s)) > k) {
				list.add(Integer.parseInt(intStrs[i].substring(s, l + s)));
			}
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i); // 오토박싱과 오토언박싱 개념 이 코드에선 오토 언박싱을 활용함.
		}

		return answer;
	}
}