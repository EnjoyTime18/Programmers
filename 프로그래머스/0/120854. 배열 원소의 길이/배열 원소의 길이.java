class Solution {
    public int[] solution(String[] strlist) {
       int[] strlength = new int[strlist.length];
        
       for(int i=0; i<strlist.length; i++) {
//         String s = strlist[i];
           strlength[i] = strlist[i].length();
       }
        
        return strlength;
    }
    
      public static void main(String[] args) {
        Solution s = new Solution();
        String[] strlist1 = {"We", "are", "the", "world!"};
        String[] strlist2 = {"I", "Love", "Programmers."};
        System.out.println(s.solution(strlist1));
        System.out.println(s.solution(strlist2));
    }
}