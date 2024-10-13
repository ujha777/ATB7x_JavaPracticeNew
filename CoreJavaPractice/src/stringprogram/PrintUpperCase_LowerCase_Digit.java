package stringprogram;

public class PrintUpperCase_LowerCase_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="No 26 Sound";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			/*
			 * if (Character.isUpperCase(c)) { System.out.println(c); }
			 */
			if (Character.isLowerCase(c)) {
				System.out.println(c);
			}
//			if (Character.isDigit(c)) {
//				System.out.println(c);
//			}
		}

	}

}
