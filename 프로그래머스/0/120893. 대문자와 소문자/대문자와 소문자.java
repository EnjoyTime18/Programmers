class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toCharArray();
          
        //is와 to의 차이
        //is는 소문자인지 대문자인지 판별하는 메소드. 반환타입이 boolean 이다.
        //to는 소문자를 대문자로 대문자를 소문자로 변경해주는 메소드. 반환타입이 리터럴 값이다.
        for(int i=0; i<c.length; i++) {
        	if(Character.isLowerCase(c[i])) { // 해당 요소 하나 뽑은게 소문자냐?
        		c[i] = Character.toUpperCase(c[i]); //대문자로 변경
        	} else { // 해당 요소 하나 뽑은게 대문자냐?
        		c[i] = Character.toLowerCase(c[i]); //소문자로 변경
        	}
        }
        
        String result = String.valueOf(c);       
        return result;
    }
}