import java.util.Scanner;

public class Solution {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int n = sc.nextInt();

		// 반복문 사용
//		for (int i = 0; i < n; i++) {
//			System.out.print(str);
//		}

		// String 클래스의 repeat() 사용
		System.out.println(str.repeat(n));
	}
}