class Solution {
    public int solution(int n, int k) {
       int f1 = n * 12000; //120000
       int f2 = k * 2000;  //6000
       int f3 = 0;         //서비스 음료수 개수 + 음료수 값 2000
       if(n >= 10) {
          f3 = n / 10 * 2000;
       }
        
        return f1 + f2 - f3;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(10,3);
        s.solution(64,6);         
    }
}