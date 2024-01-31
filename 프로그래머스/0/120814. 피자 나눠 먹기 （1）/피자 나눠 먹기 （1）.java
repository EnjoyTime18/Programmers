class Solution {
    public int solution(int n) {
        // n = 7 -> 1 -> 15
        int piz = 7;
        int minpiz = 0;
        
        if(n % 7 == 0) {
            minpiz = n / 7;
        } else {
            minpiz = n / 7;
            minpiz++;
        }
        
        return minpiz;
    }
}