import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
		// indexOf() 메소드는 String 타입과 List 계열의 타입에서만 사용 가능하다.
		// 따라서 기본형 타입의 배열이나 String 타입의 배열에서 indexOf()를 사용하려면 이를 List 타입으로 변환 해주어야 한다.
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		int count = 0;

		for (int n : arr) {
			arraylist.add(n);
			if (n == 2) {
				count++;
			}
		}

		int[] answer;

//		if (count > 1) {
//			// List 타입의 subList() == Arrays.copyOfRange()
//			List<Integer> list = arraylist.subList(arraylist.indexOf(2), arraylist.lastIndexOf(2) + 1);
//			answer = new int[list.size()];
//
//			for (int i = 0; i < list.size(); i++) {
//				answer[i] = list.get(i);
//			}			
//		} else if (count == 1) {
//			answer = new int[1];
//			answer[0] = arr[arraylist.indexOf(2)];
//		} else {
//			answer = new int[1];
//			answer[0] = -1;
//		}
//
//		return answer;

		if (count > 0) {
			if (count > 1) {
				List<Integer> list = arraylist.subList(arraylist.indexOf(2), arraylist.lastIndexOf(2) + 1);
				answer = new int[list.size()];
				
				for (int i = 0; i < list.size(); i++) {
					answer[i] = list.get(i);
				}				
			} else {
				answer = new int[]{arr[arraylist.indexOf(2)]};
			}
		} else {
			answer = new int[]{-1};
		}
		
		return answer;
	}
}