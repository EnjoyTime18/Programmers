import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> arylist = new ArrayList<String>();
        
        for(int i=0; i<names.length; i=i+5) {
        	arylist.add(names[i]);
        }
        
        return arylist.toArray(new String[arylist.size()]);
    }
}