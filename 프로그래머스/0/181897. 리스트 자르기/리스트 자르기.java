import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {		
		if (n == 4) {
			ArrayList<Integer> arraylist = new ArrayList<Integer>();			
			int[] list = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);			
			for (int i = 0; i < list.length; i += slicer[2]) {
				arraylist.add(list[i]);
			}
			
			int[] answer = new int[arraylist.size()];			
			for(int i=0; i<arraylist.size(); i++) {
				answer[i] = arraylist.get(i);
			}			
			return answer;			
		} else if (n == 3) {
			return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
		} else if (n == 2) {
			return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
		} else {
			return Arrays.copyOfRange(num_list, 0, slicer[1]+1);
		}		
	}
}