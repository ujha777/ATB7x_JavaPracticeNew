package stringprogram;

public class PrintUpdatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sky is BLue";
		String[] words = str.split(" ");
		String ns="";
		for (String word : words) {
		
			if (word.equalsIgnoreCase("Blue")) {
				ns=ns+"RED"+" ";
			}
			else {
				ns=ns+word+" ";
			}
		}
		System.out.print(ns);

	}

}