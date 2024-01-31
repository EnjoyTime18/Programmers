class Solution {
    public int[] solution(int n) {
        int arrayindex = 0;
        
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                arrayindex++;
            }
        }
        
        int[] num = new int[arrayindex];
        int index = 0;
        
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                num[index] = i;
                index++;
            }
        }
        
        return num;
        
    }
}