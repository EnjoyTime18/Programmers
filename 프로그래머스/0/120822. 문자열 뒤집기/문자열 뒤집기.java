class Solution {
    public String solution(String my_string) {
        
//         int maxstr = my_string.length() -1;
        
//         String result = "";
       
//         for(int i=0; i<my_string.length(); i++) {
//             char c = my_string.charAt(maxstr);
//             result += c;
//             maxstr--;
//         }
        
//         return result;
        
        // StringBuilder sb = new StringBuilder(my_string);
        // return sb.reverse().toString();
        
        return new StringBuilder(my_string).reverse().toString();
    }
}