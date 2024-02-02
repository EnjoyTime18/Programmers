import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
		
        String s = my_string.toLowerCase();
        char[] c = s.toCharArray();  
        Arrays.sort(c);
        
        my_string = new String(c);
//      my_string = String.valueOf(c);
        
        return my_string;
    }
}