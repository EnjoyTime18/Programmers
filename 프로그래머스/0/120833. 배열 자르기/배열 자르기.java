class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int index = 0;
		
		for(int i=0; i<numbers.length; i++) {
			if(i >= num1 && i <= num2) {
				index++;
			}
		}
				
		int[] number = new int[index];
		int numindex = 0;
		
		for(int i=0; i<numbers.length; i++) {
			if(i >= num1 && i <= num2) {
				//number[i] = numbers[i]; //number[i] 여기서 에러 터짐 주의. 조건이 성립하면 인덱스 0으로 고정값 주어서 값을 배열에 넣어야 하는데 i값으로 주면 인덱스가 0이 아닌 i값으로 인덱스가 잡혀 에러 발생
				number[numindex] = numbers[i];
				numindex++;
			}
		}
	
		return number;
    }
}