package stringprogram;

public class FetchStringWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="No 26 Sound";
		String r="";
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if (!Character.isWhitespace(c)) {
				r=r+c;
			}
		}
		System.out.println(r);

	}

}
