class Solution {
    public int solution(int[] dot) {
        
//        int total = 0;
        
//        for(int i=0; i<1; i++) {
//            int fnum = dot[i];
//            for(int j=1; j<2; j++) {
//                int lnum = dot[j];
//                if(fnum > 0 && lnum > 0) {
//                    total = 1;
//                } else if (fnum < 0 && lnum < 0) {
//                    total = 3;
//                } else if (fnum < 0 && lnum > 0) {
//                    total = 2;
//                } else {
//                    total = 4;
//                }
//            }
//        }
                
//         return total;   
        
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if(dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if(dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        
        return answer;
    }
}