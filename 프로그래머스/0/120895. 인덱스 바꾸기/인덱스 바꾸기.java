class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] c = my_string.toCharArray();
        
        char c1 = c[num1];
        char c2 = c[num2];
        
        c[num1] = c2;
        c[num2] = c1;
        
       return String.valueOf(c);        
    }
}