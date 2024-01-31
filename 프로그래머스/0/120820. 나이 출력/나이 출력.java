class Solution {
    public int solution(int age) {
        int year = 2022;
        return (year - age) + 1;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(40));
        System.out.println(s.solution(23));
    }
}