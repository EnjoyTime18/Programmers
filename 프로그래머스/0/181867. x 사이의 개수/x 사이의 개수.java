import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		// split() 2번째 인자값은 리턴받을 배열의 길이를 제한함.
		// 음수일 경우 맨 뒤의 마지막 구분자(빈값)에 대해 split을 모두 진행 or 모든 구분값을 나눠서 배열로 반환한다.
		// limit를 음수를 주면 모든 요소를 다 리스트에 포함시켜서 반환함.
		for (String s : myString.split("x", -1)) {
			list.add(s.length());
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		for (int n : answer) {
			System.out.println(n);
		}

		return answer;
	}
}