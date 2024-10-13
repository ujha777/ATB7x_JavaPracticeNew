package stringprogram;

public class BreakTheSentenceIntoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HOW TO GET A WORD";
		String[] ns = str.split(" ");
		for (String string : ns) {
			System.out.println(string);
		}
		
		
	}

}
