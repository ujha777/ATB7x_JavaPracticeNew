package stringprogram;

public class GFG_LeftMostRepeatingCharacters_Type2 {
	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		System.out.println("Index of leftmost repeating character:");
		System.out.println(leftMost(str));  
	}

	static int leftMost(String str) {
		// TODO Auto-generated method stub
		int[] count=new int[CHAR];
		//count frequency
		for(int i=0;i<str.length();i++){
			 count[str.charAt(i)]++;
		}
		//first character 
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)]>1)
				return i;
		}
		return -1;
	}

}
