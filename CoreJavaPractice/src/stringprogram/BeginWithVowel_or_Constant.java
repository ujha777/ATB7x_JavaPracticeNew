package stringprogram;

import java.util.Scanner;

public class BeginWithVowel_or_Constant {

	public static void main(String[] args) {
        String pl ="";
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                //begin with vowel
                if(i==0)
                    pl = s + "WAY";
                 else
                    pl=s.substring(i)+s.substring(0,i)+"AY";


            }
        }
        System.out.println(pl);
        }
}
