class Solution {
    public int[] solution(int[] num_list) {
        
    int[] newnum = new int[num_list.length];
        
    //먼저 num_list 배열 마지막 요소의 값 접근하여 마지막 요소의 값을 새로운 배열 차례 순서대로 값 넣기
    //기존 배열 마지막 index 값 구하기
    int cont = num_list.length-1; // 5-1 -> index 4 (num_list 요소 값 -> 5)  
        
        for(int i=0; i<num_list.length; i++) { // 0 ~ 4까지 반복 
            //num_list 배열 마지막에 있는 값 꺼내서 새로운 배열 첫번째 값 넣기
            newnum[i] = num_list[cont];
            cont--; // num_list 배열 접근 index 감소 (거꾸로 탐색 순회를 해야되니...)
        }
        
        return newnum;
        
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {1, 1, 1, 1, 1, 2};
        int[] num3 = {1, 0, 1, 1, 1, 3, 5};
        System.out.println(s.solution(num1));
        System.out.println(s.solution(num2));
    }
}