class Solution {
    public int[] solution(int n, int[] numlist) {
        int arrayindex = 0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) {
                arrayindex++;
            }
        }
        
        int[] num = new int[arrayindex];
        int index = 0;
        
         for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) {
                num[index] = numlist[i];
                index++;
            }
        }
       
        return num;
        
    }
}