class Solution {
    public double solution(int[] numbers) {    
        int total = 0;
        
        for(int num : numbers) {
            total += num;
        }
        
        return (double) total / numbers.length;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(s.solution(num1));
        System.out.println(s.solution(num2));
    }
}