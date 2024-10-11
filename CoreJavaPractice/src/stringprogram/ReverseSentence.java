package stringprogram;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		String str="I am a an India";
		String[] words =str.split(" ");
		String reversedSentence = " ";
		for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }
		reversedSentence=reversedSentence.trim();
		 	System.out.println("Original Sentence: " + str);
	        System.out.println("Reversed Sentence: " + reversedSentence);
	}

}
