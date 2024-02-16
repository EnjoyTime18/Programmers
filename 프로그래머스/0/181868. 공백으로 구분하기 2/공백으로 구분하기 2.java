class Solution {
    public String[] solution(String my_string) {
		//방법1
		// 1. 문자열의 앞뒤 공백을 제거한다.
//        my_string = my_string.trim();

		// 2. 문자열을 공백 문자(스페이스)를 기준으로 분리하여 배열로 반환한다.
		// 정규 표현식 "[ ]+"을 사용하여 하나 이상의 공백 문자를 분리 기준으로 삼는다.
		// 예를 들어, "Hello World" -> ["Hello", "World"] or i love you -> ["i", "love", "you"]
//        String[] words = my_string.split("[ ]+");

		// 3. 분리된 단어들을 문자열 배열로 반환한다.
		// 빈 문자열은 이전 단계에서 제거했기 때문에 ""값이 들어가지 않는다.
//        return words;

		// 동일한 코드 : return my_string.trim().split("[ ]+");

		//방법2
		// split() 메서드에 정규표현식 "\\s+"를 사용했다. \s는 공백을 나타내는 특수문자를 의미하고, +는 하나 이상의 연속된 공백을 나타낸다. 연속된 공백도 하나의 구분자로 간주하여 단어를 분리하기 위함이다.
		// 하지만 이대로 실행하면 ["","i","love","you"] 와 같이 공백도 함께 출력되기 때문에 split() 메서드 앞에 trim() 메서드를 추가하여 공백을 제거해줬다.
		return my_string.trim().split("\\s+"); //"\\s+" : 결과적으로 하나 이상의 연속된 공백을 뜻하기에 연속된 공백을 기준으로 문자열을 나누겠다.
	}
}