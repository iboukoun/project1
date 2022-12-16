package Blessing;

import java.util.Scanner;

public class Project15 {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            System.out.println("Type two words below this sentence!");
            String mystery=in.next();
            String mystery2=in.next();
            in.close();
            int strlen="1234".length();
            System.out.println(strlen);

            System.out.println("the length of this word is: "+mystery.length());
//            This gets the character at the 1st index ,and the second charecter
            char secondChar="1234".charAt(1);
            System.out.println(secondChar);
            System.out.println("the first character is: "+ mystery.charAt(0));
            String combo1 ="1234" + "5678";
            String combo2= "1234".concat("5678");
            System.out.println(combo1);
            System.out.println(combo2);

            System.out.println(mystery+" ".concat(mystery2));
        }

}
