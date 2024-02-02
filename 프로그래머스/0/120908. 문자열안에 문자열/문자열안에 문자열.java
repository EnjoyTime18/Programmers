class Solution {
    public int solution(String str1, String str2) {
        //문제 의도 자체가 라이브러리 메소드 찾아서 사용하라는게 눈에 보이는 문제 유형
        if(str1.contains(str2)) { // String contains() 컨틴스 메소드 사용
        	return 1;
        } else {
        	return 2;
        }
    }
}