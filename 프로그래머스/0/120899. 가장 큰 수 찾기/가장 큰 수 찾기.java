class Solution {
    public int[] solution(int[] array) {
//         int maxint = 0;
//         int maxindex = 0;
//         int[] maxintlist = new int[2]; 
        
//         for(int i=0; i<1; i++) {
//             maxint = array[i];
//             for(int j=1; j<array.length; j++) {
//                 int last = array[j];
//                 if(last > maxint) {
//                     maxint = last;
//                     maxindex = j;
//                 }
//             }
//         }
        
//         maxintlist[0] = maxint;
//         maxintlist[1] = maxindex;
        
        int max = 0;
        int maxindex = 0;
        
        for(int i=0; i<array.length; i++) {
           if(array[i] > max) {
               max = array[i];
               maxindex = i;
           }
        }
        
        int[] answer = {max, maxindex};
        
        return answer;
    }
}