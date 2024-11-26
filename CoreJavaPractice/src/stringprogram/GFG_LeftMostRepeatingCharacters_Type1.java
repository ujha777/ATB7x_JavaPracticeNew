package stringprogram;

public class GFG_LeftMostRepeatingCharacters_Type1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "geeksforgeeks";
	        System.out.println("Index of leftmost repeating character:");
	        System.out.println(leftMost(str));  

	}

	 static int leftMost(String str) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				 if(str.charAt(i)==str.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	

}
