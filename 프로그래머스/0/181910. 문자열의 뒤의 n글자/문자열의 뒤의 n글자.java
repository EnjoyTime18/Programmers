class Solution {
    public String solution(String my_string, int n) {
		// 반복문 사용하기
//		String s = "";
//		int index = my_string.length() - n;
//
//		for (int i = index; i < my_string.length(); i++) {
//			s += my_string.charAt(i);
//		}
//
//		return s;

		// String 클래스의 substring() 사용하기
		return my_string.substring(my_string.length() - n);
	}
}