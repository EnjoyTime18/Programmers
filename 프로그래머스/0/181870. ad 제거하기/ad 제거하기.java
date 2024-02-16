import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));		
		list.removeIf(value -> value.contains("ad"));
		
		return list.toArray(new String[list.size()]);
	}
}