import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
		int[] numarray = Arrays.copyOf(num_list, num_list.length+1);
        
        int lastindex = num_list.length-1;
        int beforeindex = lastindex -1;  
        
        if(num_list[lastindex] > num_list[beforeindex]) {
        	numarray[numarray.length-1] = num_list[lastindex] - num_list[beforeindex];
        } else {
        	numarray[numarray.length-1] = num_list[lastindex] * 2;
        }
        
        return numarray;
    }
}