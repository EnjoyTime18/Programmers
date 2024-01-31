class Solution {
    public int[] solution(int[] num_list) {
        
        int even = 0; // 짝수
        int odd = 0; // 홀수
        
        for(int numbers : num_list) {
            if(numbers % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        int[] even_odd_list = new int[2];
        even_odd_list[0] = even;
        even_odd_list[1] = odd;
        
        return even_odd_list;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {1,3,5,7};
        s.solution(n1);
        s.solution(n2);
    }
}