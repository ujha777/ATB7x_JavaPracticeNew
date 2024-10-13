package stringprogram;

public class ReverseTheCaseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="No 26 Sound";
		String r="";
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if (Character.isUpperCase(c)) {
				r=r+Character.toLowerCase(c);
			}else if (Character.isLowerCase(c)) {
				r=r+Character.toUpperCase(c);
			}
		}
		System.out.println(r);

	}



}
