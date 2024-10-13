package stringprogram;

public class NewStringWithDigitFollowedByString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="No 26 SounD";
		String digit="";
		String r="";
		String newstr="";
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if (Character.isDigit(c)) {
				digit=digit+c;
			}
			else{
				r=r+c;
			}
			
			newstr=digit+r;
			
		}
		System.out.println(newstr);
		
		

	}

}
