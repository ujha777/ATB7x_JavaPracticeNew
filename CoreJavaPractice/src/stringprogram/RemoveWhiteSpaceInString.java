package stringprogram;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=" Gangesh is a good guy ";
		String str1=" Darsh is a cute baby ";
		String[] regex = input.split(" ");
		for (String string : regex) {
			System.out.print(string);
		}
		System.out.println("\n");
		 //Convert String array in a String
		String[] str2 = str1.split(" ");
       // System.out.println("By using append method in String Builder");
        StringBuilder sb=new StringBuilder();
        for (String str4:str2){
           sb= sb.append(str4);
        }
        System.out.println(sb);
	}

}
