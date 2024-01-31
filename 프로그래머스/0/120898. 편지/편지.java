class Solution {
    public int solution(String message) {
        return message.length() * 2;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("happy birthday!");
        s.solution("I love you~");
    }
}