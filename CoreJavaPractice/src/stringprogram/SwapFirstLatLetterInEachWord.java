package stringprogram;

public class SwapFirstLatLetterInEachWord {

	public static void main(String[] args) {
		 String str="In the box";
	        String ns1="";
	        String[] words = str.split(" ");
	        for (String word:words){
	            char f= word.charAt(0);
	            char l= word.charAt(word.length()-1);
	            String m = word.substring(1, word.length() - 1);
	            ns1=ns1+l+m+f+" ";
	        }
	        System.out.println(ns1);
	}

}
