package stringprogram;

public class FetchFirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HOW TO GET A WORD";
		String[] ns = str.split(" ");
		for (String word : ns) {
		System.out.println(word.charAt(0));
		}
		
	}

}
