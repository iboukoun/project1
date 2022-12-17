package Blessing;
import java.util.Scanner;

public class Homework {
        public static void main(String [] args){


                Dog dog1=new Dog();
                System.out.println("enter name of a dog and his age");
                Scanner sc=new Scanner(System.in);
                String name= sc.nextLine();
                int age = sc.nextInt();
                dog1.setNameAge(name,age);
                //dog1.setNameAge("bingo",23);
                System.out.print(dog1.name);
                dog1.shout();
                Cat cat1=new Cat();
                cat1.setNameAge("minou",23);
                System.out.println(cat1.age);
                if(cat1.age > 23)
                {
                       cat1.shout();
                }
                else
                {
                        System.out.println(dog1.name+" is sleeping");
                }


        }
}
