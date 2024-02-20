import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
		ArrayList<String> list = new ArrayList<String>();
		String[] strlist = myStr.split("[a-c]+");

		if (strlist.length == 0) {
			list.add("EMPTY");
		} else {
			for (String s : strlist) {
				if (!s.equals("")) {
					list.add(s);
				}
			}
		}

		return list.toArray(new String[list.size()]);
	}
}