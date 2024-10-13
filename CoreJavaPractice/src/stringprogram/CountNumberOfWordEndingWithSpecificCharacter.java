package stringprogram;

public class CountNumberOfWordEndingWithSpecificCharacter {

	public static void main(String[] args) {
		String str="BED RED WET NET SAID";
		String[] words = str.split(" ");
		
		int count= 0;
		for (String word : words) {

			if (word.endsWith("D")) {
				count++;
			}
		}
		System.out.print(count);

	}


}
