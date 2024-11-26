package stringprogram;

import java.util.Arrays;

public class GFG_CheckForAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 'w' };
      
        // Function Call
        if (checkAnagaram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");

	}
	
	
	static boolean checkAnagaram(char[]str1,char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1!=n2) {
			return false;
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for (int i = 0; i < n1; i++) {
			
			if (str1[i]!=str2[i]) {
				return false;
			}
		}
			return true;
		
		
	}

}
