package stringprogram;

import java.util.Scanner;

public class MoveEchLetterBy2 {

	  public static void main(String[] args) {
	      String str="cycleofalphabet";
	      changeString(str);

	    }

	    static void changeString(String str){
	        char[] ch = str.toCharArray();
	        for (int i = 0; i < str.length(); i++) {
	            int dist=ch[i]-'a';

	            //if z is exceeded
	            if (dist+(ch[i]-'a')>=26){
	                dist=(dist+(ch[i]-'a'))%26;
	                ch[i]=(char)('a'+dist);
	            }else {
	                ch[i]=(char) (ch[i]+dist);
	            }

	        }
	        String s=new String(ch);
	        System.out.println(s);

	    }

}
