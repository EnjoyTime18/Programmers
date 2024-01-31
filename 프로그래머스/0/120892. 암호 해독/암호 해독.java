class Solution {
    public String solution(String cipher, int code) {
        
        int fcode = code - 1; 
        
        String s = "";
        
        for(int i=fcode; i<cipher.length(); i=i+code) {
            char c = cipher.charAt(i);
            s += c;
        }
        
           // 효율적인 정답
//         String answer = "";
//         for(int i = code-1; i < cipher.length(); i+=code) {
//             answer += cipher.charAt(i);
//         }
        
//         return answer;
        
        //밑 코드 정답은 아님. 풀이 과정일뿐..
        // for(int i=0; i<cipher.length(); i++) {
        //     char c = cipher.charAt(fcode); // a
        //     int x = fcode + 4;
        //     char c = cipher.charAt(x);
        //     s += c;
        // }
        
        return s;
    }
}