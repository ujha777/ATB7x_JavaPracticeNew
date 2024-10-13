package stringprogram;

public class CountUpperCaseLowerCaseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="No 26 Sound";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (Character.isLowerCase(c)) {
				count++;
				
			}
			
		}
		/*
		 * for (int i = 0; i < str.length(); i++) { char c = str.charAt(i);
		 * 
		 * if (Character.isUpperCase(c)) { count++;
		 * 
		 * }
		 * 
		 * } for (int i = 0; i < str.length(); i++) { char c = str.charAt(i);
		 * 
		 * if (Character.isDigit(c)) { count++;
		 * 
		 * }
		 * 
		 * }
		 */
		System.out.println(count);
	}

}
