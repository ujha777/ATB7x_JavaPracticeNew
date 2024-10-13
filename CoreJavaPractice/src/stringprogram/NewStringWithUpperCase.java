package stringprogram;

public class NewStringWithUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="No 26 SounD";
		String newstr="";
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if (Character.isUpperCase(c)) {
				newstr=newstr+c;
			}
		}
		System.out.println(newstr);

	}

}
