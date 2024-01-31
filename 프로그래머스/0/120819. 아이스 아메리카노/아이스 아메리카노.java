class Solution {
    public int[] solution(int money) {
       int[] coffeelist = new int[2];
       int coffee = 5500;
        
       int cf = money / coffee;
       int mon = money % coffee;
        
       coffeelist[0] = cf;
       coffeelist[1] = mon;
        
       return coffeelist;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(5500);
        s.solution(15000);
    }
}