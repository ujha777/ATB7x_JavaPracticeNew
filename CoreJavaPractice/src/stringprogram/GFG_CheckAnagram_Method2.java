package stringprogram;

import java.util.Arrays;

public class GFG_CheckAnagram_Method2 {
	static int NO_OF_CHARS = 256;
	/*
	 * Create count arrays of size 256 for both strings. Initialize all values in
	 * count arrays as 0. Iterate through every character of both strings and
	 * increment the count of character in the corresponding count arrays. Compare
	 * count arrays. If both count arrays are same, then return true.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1="geeksforgeeks";
		String str2="forgeeksgeeks";

		// Function call
		if (areAnagram(str1, str2))
			System.out.println("The two strings are"
					+ "anagram of each other");
		else
			System.out.println("The two strings are not"
					+ " anagram of each other");
	}

		static boolean areAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		
			if (str1.length()!=str2.length()) {
				return false;
			}
			int count[]= new int[NO_OF_CHARS];
			
			for (int i = 0; i < str1.length(); i++) {
				count[str1.charAt(i)]++;
				count[str2.charAt(i)]--;
			}
			for (int i = 0; i < NO_OF_CHARS; i++) {
				if (count[i]!=0) {
					return false;
				}
			}

		return true;
	}

}
