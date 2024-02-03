import java.util.Arrays;

class Solution { //Character.isDigit(), Character.getNumericValue() 메소드가 핵심
    public int[] solution(String my_string) {

		// 다른 방식 풀이 (정답 O)
//		char[] c = my_string.toCharArray();
//		Arrays.sort(c);

//		int intindex = 0; // 배열 생성용 인덱스 

//		for(int i=0; i<c.length; i++) {
//			if(Character.isDigit(c[i])) {
//				intindex++;
//			}
//		}

//		int[] result = new int[intindex];		
//		int index = 0; // 처음에 인덱스 초기값 0으로 주고 배열에 값 대입 할 때마다 인덱스 값 하나씩 증가 하기 위한 변수

//		for(int i=0; i<c.length; i++) {
//			if(Character.isDigit(c[i])) {
//		   		char c1 = c[i];

//		   		result[index] = c1; //char형을 정수형 배열에 바로 넣으면 그 문자가 아스키 코드 숫자값으로 변환되어 넣어짐. 주의!

				// 방법1
//		  		result[index] = Character.getNumericValue(c1);

				// 방법2
//				result[index] = Integer.parseInt(c1); parseInt() -> 인자값에 String 타입만 받음
//	    		result[index] = Integer.parseInt(Character.toString(c1)); // 먼저 char형을 string형으로 변환하여 parseInt()에 인자값에 넣음.

//		   		index++;
//		}
//	}
//      return result;      

		int intindex = 0; // 배열 생성용 인덱스

		for (int i = 0; i < my_string.length(); i++) {
			if (Character.isDigit(my_string.charAt(i))) {
				intindex++;
			}
		}

		int[] result = new int[intindex];
		int index = 0; // 처음에 인덱스 초기값 0으로 주고 배열에 값 대입 할 때마다 인덱스 값 하나씩 증가 하기 위한 변수

		for (int i = 0; i < my_string.length(); i++) {
			if (Character.isDigit(my_string.charAt(i))) {
//				result[index] = my_string.charAt(i); //char형을 정수형 배열에 바로 넣으면 그 문자가 아스키 코드 숫자값으로 변환되어 넣어짐. 주의!

				// 방법1
				result[index] = Character.getNumericValue(my_string.charAt(i));

				// 방법2
//				result[index] = Integer.parseInt(my_string.charAt(i)); parseInt() -> 인자값에 String 타입만 받음
//			    result[index] = Integer.parseInt(Character.toString(my_string.charAt(i))); // 먼저 char형을 string형으로 변환하여 parseInt()에 인자값에 넣음.

				index++;
			}
		}

		Arrays.sort(result);
		return result;
	}
}