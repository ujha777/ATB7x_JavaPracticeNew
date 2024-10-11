package stringprogram;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String input = sc.next();
			String rev="";
			for (int i = 0; i < input.length(); i++) {
				rev=input.charAt(i)+rev;
				
			}
			if (rev.equals(input)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not a Palindrome");
			}
		}
		

	}

}
