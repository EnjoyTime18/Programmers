import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
//		String[] s = myString.split("x");
//		Arrays.sort(s);
//
//		ArrayList<String> list = new ArrayList<String>();
//
//		for (String str : s) {
//			list.add(str);
//		}
//		
//		return list.toArray(new String[list.size()]);

		ArrayList<String> list = new ArrayList<String>();

		for (String str : myString.split("x")) {
			if (!str.equals("")) { // str = "" -> str.equals("") 이 자체로만 보면 true이지만 ! 부정연산자 때문에 결과적으로 true에서 반대결과를 갖는 false가 됨. 
				list.add(str);     // 그래서 빈 문자열인 경우 배열 요소에 넣지 않음.
			}			
		}

		Collections.sort(list);
		
		return list.toArray(new String[list.size()]);
	}
}