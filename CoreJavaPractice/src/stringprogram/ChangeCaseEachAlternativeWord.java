package stringprogram;

public class ChangeCaseEachAlternativeWord {

	 public static void main(String[] args) {
	        String str=" A RED SEED";int count=0;
	        String ns="";

	        String[] words = str.split(" ");
	        for (String word:words){
	            if (count++%2==0){
	                ns=ns+word.toUpperCase()+" ";
	            }
	            else ns=ns+word.toLowerCase()+" ";
	        }
	        System.out.println(ns);


	    }
}
