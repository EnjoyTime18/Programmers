import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}

//		String s = (n % 2 == 0) ? n + " is even" : n + " is odd";
//		System.out.println(s);
	}
}