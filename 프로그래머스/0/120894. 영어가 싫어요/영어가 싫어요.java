class Solution {
    public long solution(String numbers) {

		numbers = numbers.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3")
				.replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7")
				.replace("eight", "8").replace("nine", "9");

        //이 문제의 의도가 바로 다이렉트로 long 타입으로 형변환을 하라는 의도인듯. 의도가 Long.parseLong() 무조건 사용해서 형변환해라. 이거 인듯...
        //아래는 int 형으로 형변환 후 또 바로 long 타입으로 명시적 형변환하여 2번 형변환 과정을 거쳤기 때문에 정답이 아닌듯.
		//return (long) Integer.parseInt(number);
        
		return Long.parseLong(numbers);
	}
}