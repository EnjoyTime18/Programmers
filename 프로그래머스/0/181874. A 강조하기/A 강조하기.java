class Solution {
    public String solution(String myString) {
		String answer = "";

		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'a') {
				answer += Character.toUpperCase(myString.charAt(i));
			} else if (myString.charAt(i) == 'A') { // 'A'인 경우에도 밑 if문에 의해 소문자로 변경되기 떄문에 이를 막아야함.
				answer += myString.charAt(i);
			} else if (myString.charAt(i) != 'a' && Character.isUpperCase(myString.charAt(i))) {
				answer += Character.toLowerCase(myString.charAt(i));
			} else {
				answer += myString.charAt(i);
			}
		}

		return answer;
	}
}