package stringprogram;

public class RemoveSpecialCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="This #$%^^&*(is$%^asd&*nice stiry";
		String regex = "[^a-zA-Z0-9]";
		System.out.println(input.replaceAll(regex," "));
	}

}
