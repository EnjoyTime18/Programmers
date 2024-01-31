class Solution {
    public int solution(int slice, int n) {
        
        // 삼항연산자 사용
//        return (n % slice == 0) ? n / slice : n / slice + 1;
       
         int minpiz = 0;
        
         if(n % slice == 0) {
             minpiz = n / slice;
         } else {
             minpiz = n / slice + 1;
         }
        
         return minpiz;
    }
}