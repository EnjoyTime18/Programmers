class Solution {
    public int solution(String[] s1, String[] s2) {
//         int seq = 0;
        
//         for(int i=0; i<s1.length; i++) {
//             String fs = s1[i];           
//             for(int j=0; j<s2.length; j++) { 
//                 String ls = s2[j];               
//                 if(fs.equals(ls)) {
//                     seq++;
//                 }
//             }
//         }
        
//         return seq;
        
        //for-each문으로 문제풀이
        //s1 하나만 뽑고 s2 나머지 다 요소들 순회하면서 s1이랑 비교
        int answer = 0;
        for(String str1 : s1) {
            for(String str2 : s2) {
                if(str1.equals(str2)) {
                    answer++;                 
                }
            }
        }
        return answer;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        String[] s3 = {"n", "omg"};
        String[] s4 = {"m", "dot"};
        s.solution(s1,s2);
        s.solution(s3,s4);
    }
}