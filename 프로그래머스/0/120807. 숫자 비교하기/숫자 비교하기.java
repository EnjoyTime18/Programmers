class Solution {
    public int solution(int num1, int num2) {
        
        return (num1 == num2) ? 1 : -1;
        
//         if (num1 == num2) {
//             return 1;
//         }   
        
//         return -1;
    }
    
      public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2,3));
        System.out.println(s.solution(11,11));
        System.out.println(s.solution(7,99));
    }
}