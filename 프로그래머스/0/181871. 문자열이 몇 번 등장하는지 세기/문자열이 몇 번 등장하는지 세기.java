class Solution {
    public int solution(String myString, String pat) {
//		int answer = 0;
//		int startindex = 0;
//		int patindex = pat.length();
//
//		for (;;) {
//			if (patindex > myString.length()) {
//				break;
//			}
//
//			if (myString.substring(startindex, patindex).equals(pat)) { 
//				answer++;
//			}
//			
//			startindex++;
//			patindex++;
//			
//			// index  patindex
//			//  0~2      3
//			//  1~3      4
//			//  2~4      5
//			//  3~5      6			
//		}
//		
//		return answer;
		
		int cnt = 0;
		for (int i = 0; i < myString.length(); i++) {
			if (myString.substring(i).startsWith(pat)) {
				cnt++;
			}
		}		
		return cnt;
	}
}