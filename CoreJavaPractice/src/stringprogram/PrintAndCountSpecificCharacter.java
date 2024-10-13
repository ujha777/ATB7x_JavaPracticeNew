package stringprogram;

public class PrintAndCountSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Gangesh Gunjan Jha";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
				System.out.print(c);
			}
		}
		
		System.out.println(count);

	}

}
