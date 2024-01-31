class Solution {
    public int[] solution(int[] numbers) {
        
        for(int i=0; i<numbers.length; i++) {
            //numbers[i] = numbers[i] * 2;
            numbers[i] *= 2; // 복합대입연산자 사용
        }
        
        return numbers;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {1,2,3,4,5};
        int[] num2 = {1,2,100,-99,1,2,3};
        s.solution(num);
        s.solution(num2);
    }
}