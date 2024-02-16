import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < names.length; i = i + 5) {
			list.add(names[i]);
		}

		return list.toArray(new String[list.size()]);
	}
}