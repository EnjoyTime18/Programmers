class Solution {
    public String solution(String my_string) {
//      String s = my_string.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
		String s = my_string.replaceAll("[aeiou]", ""); // ALL 메소드는 정규표현식 사용가능. 여러 문자 한번에 처리하기 쉬움.
		return s;
    }
}