class Solution {
    public int solution(int n) {
        int total = 0;
        
        // 0 나누기 2는 나머지가 0이므로 성립되어 처음에 total 변수에 0값이 저장되어 누적.
        // for(int i=0; i<=n; i++) {
        //     if(i % 2 == 0) { // i의 값이 홀수는 if문 거짓, 짝수만 참
        //         total += i;
        //     }
        // }
        
        for(int i=0; i<=n; i=i+2) { 
            total += i;
        }
        
        return total;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(4));
    }
}