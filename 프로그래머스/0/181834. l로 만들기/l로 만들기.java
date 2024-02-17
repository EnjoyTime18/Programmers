class Solution {
    public String solution(String myString) {
// 		String answer = "";

// 		for (int i = 0; i < myString.length(); i++) {
// 			if (myString.charAt(i) < 'l') { // 아스키 코드 소문자 기준 : 'a' = 97, 'ㅣ' = 108
// 				answer += 'l';
// 			} else {
// 				answer += myString.charAt(i);
// 			}
// 		}

// 		return answer;
        
        return myString.replaceAll("[a-k]", "l");
	}
}