class Solution {
    public int solution(int n) {
    // 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 -> a * b = n
       int result = 0;
        for(int i=1; i<=n; i++) { // i가 0일 때 n (%,/) 0은 성립이 안됨. 자체 에러 발생.
            if(n % i == 0) {  // 20을 0으로 나누었을 때 아예 나워지지 않기 때문에 에러..
                result++;
            }
        }
        
        return result;
    }
}