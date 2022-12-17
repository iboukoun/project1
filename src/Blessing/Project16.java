package Blessing;

import java.util.Scanner;

public class Project16 {
        public static void main(String [] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter an integer value");
            int original = sc.nextInt();
            sc.close();
            int copy=original;
            System.out.println(original+ " equal "+ copy+";"+(original==copy));

            if(copy==original){
                System.out.println("(copy==original) is "+ (copy==original));

                int x = 100;
                int y= 100;
                if (x==y){
                    System.out.println("they are equal.");
                }
                System.out.println("string"=="string");
                System.out.println("string".equals("string"));

                String string1= "hello world";
                String string2=new String("hello world");
                System.out.println(string1==string2);
                System.out.println(string1.equals(string2));
            }
        }
}
