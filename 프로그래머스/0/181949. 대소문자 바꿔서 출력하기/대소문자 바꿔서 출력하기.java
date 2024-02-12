import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String s = "";
		
		for (int i = 0; i < a.length(); i++) {
			if (Character.isLowerCase(a.charAt(i))) {
				s += Character.toUpperCase(a.charAt(i));
			} else {
				s += Character.toLowerCase(a.charAt(i));
			}
		}
		
		System.out.println(s);
	}
}