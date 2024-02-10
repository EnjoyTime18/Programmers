import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) { // 총 세로로 몇 줄을 찍을건지(줄 수)
        	//i가 1이라면 첫 줄이고, j가 1이면 별을 하나 찍어야 한다.
        	for(int j=1; j<=i; j++) { // 해당 줄에 옆으로 늘어나는 별을 몇 개를 찍을건지
        		System.out.print("*"); //옆으로 반복적으로 찍어야 하니 print() 사용. println() -> X
        	}  
        	
        	System.out.println(); // 별을 찍은 후에 다음 줄에도 별을 찍어야 하니 줄 바꿈 후 바깥쪽 for문 이동       	
        }
        
    }
}