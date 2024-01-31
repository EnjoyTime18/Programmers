class Solution {
    
    public int solution(int num1, int num2) {
        // int / int 이므로 int 타입의 결과를 냄. 1.5가 나와야 하므로 num1 변수에 명시적 형변환을 하였음.
        double avg = (double) num1 / num2; 
        
        // 1.5 * 1000 -> double * int 이므로 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
        // 결과적으로 double * double 이 되는것. 그에 따라 변수도 int 타입이 아닌 double 타입으로 선언해야함.
        double sult = avg * 1000;
        
        // 변수 sult 값이 1500.0 이므로 1500으로 소수점 없이 정수형으로 변경해야 하므로 int 타입으로 명시적 형변환 하였음.
        int result = (int) sult; 
        return result;
    }
    
     public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3,2));
        System.out.println(s.solution(7,3));
        System.out.println(s.solution(1,16));
    }
       
}