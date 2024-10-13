package stringprogram;

public class CapitalizedEachWord {

	 public static void main(String[] args) {
	        String str="a red seed";
	        String ns="";

	        String[] words = str.split(" ");
	        for (String word:words){
	        char firstChar = word.charAt(0);
	        char f = Character.toUpperCase(firstChar);
	        ns=ns+f+word.substring(1)+" ";
	        }
	        System.out.println(ns);


	    }
}

