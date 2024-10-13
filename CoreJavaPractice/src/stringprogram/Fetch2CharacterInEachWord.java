package stringprogram;

public class Fetch2CharacterInEachWord {

	  public static void main(String[] args) {
	        String str="In the box";
	        String[] ns = str.split(" ");
	        for (String word:ns){

	            //Print First 2 CHARCATER IN A STRING
	            System.out.print(word.substring(0,2));
	        }
	    }

}
