class Solution {
    public String solution(String rsp) {
       
        String vi = "";
        
        for(int i=0; i<rsp.length(); i++) {
            char c = rsp.charAt(i);
            if(c == '2') {
                vi += '0';
            } else if (c == '0') {
                vi += '5';
            } else {
                vi += '2';
            }
        }
        
        return vi;
    }
}