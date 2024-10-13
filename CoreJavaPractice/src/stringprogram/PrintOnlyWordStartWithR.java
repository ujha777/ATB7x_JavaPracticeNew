package stringprogram;

public class PrintOnlyWordStartWithR {
	public static void main(String[] args) {
		String str="Raj is a bad Boy and killer";
		String[] words = str.split(" ");
		for (String word : words) {
			if (word.startsWith("R")){
				System.out.println(word);
			}
		}
	}

}
