class Solution {
    public int solution(int[] array, int height) {
       int result = 0;
        
        for(int numbers : array) {
            if(numbers > height) {
                result++;
            }
        }
        
        return result;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        int[] keylist = {149,180,192,170};
        int[] keylist2 = {180,120,140};
        s.solution(keylist,167);
        s.solution(keylist2,190);
    }
}