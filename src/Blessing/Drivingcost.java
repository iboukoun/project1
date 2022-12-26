package Blessing;

import java.util.Scanner;

public class Drivingcost {
    public static void main(String[] args) {
        driving();
        }
    public static void driving(){
        Scanner sc = new Scanner(System.in);
        boolean isNumber = false;
        double num = 0;
        String strInter;
      while (isNumber == false) {
          System.out.println("enter the total miles driven per gallon");
          strInter = sc.nextLine();
          try {
              num = Double.parseDouble(strInter);
              isNumber = true;
              if (num == 0) {
                  System.out.println("invalid number");
                  isNumber = false;
              } else {
                  isNumber = true;
              }
          } catch (NumberFormatException ex) {
              System.out.println("error -enter a number");
          }
      }
      double a = num;

      boolean isNumberb = false;
      double numb = 0;
      String strDoubleb;


      while (isNumberb == false) {
          System.out.println("enter the cost per gallon");
          strDoubleb = sc.nextLine();
          try {
              numb = Double.parseDouble(strDoubleb);
              isNumberb = true;
              if (numb == 0) {
                  System.out.println("invalid number");
                  isNumberb = false;
              } else {
                  isNumberb = true;
              }
          } catch (NumberFormatException ex) {
              System.out.println("error -enter a number");
          }
      }
      double b = numb;


      // enter value c  condition
      boolean isNumberc = false;
      double numc = 0;
      String strDoublec;

      while (isNumberc == false) {
          System.out.println("enter the average miles per gallon");
          strDoublec = sc.nextLine();
          try {
              numc = Double.parseDouble(strDoublec);
              isNumberc = true;
              if (numc == 0) {
                  System.out.println("invalid number");
                  isNumberc = false;
              } else {
                  isNumberc = true;
              }
          } catch (NumberFormatException ex) {
              System.out.println("error -enter a number");
          }
      }
      double c = numc;
      // enter value d condition
      boolean isNumberd = false;
      double numd = 0;
      String strDoubled;

      while (isNumberd == false) {
          System.out.println("enter the cost of parking a day");
          strDoubled = sc.nextLine();
          try {
              numd = Double.parseDouble(strDoubled);
              isNumberd = true;
              if (numd == 0) {
                  System.out.println("invalid number");
                  isNumberd = false;
              } else {
                  isNumberd = true;
              }
          } catch (NumberFormatException ex) {
              System.out.println("error -enter a number");
          }
      }
      double d = numd;
      // value e condition
      boolean isNumbere = false;
      double nume = 0;
      String strDoublee;


      while (isNumbere == false) {
          System.out.println("enter tolls cost a day");
          strDoublee = sc.nextLine();
          try {
              nume = Double.parseDouble(strDoublee);
              isNumbere = true;
              if (nume == 0) {
                  System.out.println("invalid number");
                  isNumbere = false;
              } else {
                  isNumbere = true;
              }
          } catch (NumberFormatException ex) {
              System.out.println("error -enter a number");
          }
      }
      double e = nume;
      // calculation of averege cust is mil per day * cost per gallon over mile per gallon
      // plus parking and tolls
      double averageCost = ((a * b) / c) + d + e;
      System.out.printf(" your daily average cost is  %.2f $", averageCost);
      System.out.println(" ");


       // code to restart by calling the method driving inside driving method
        boolean restar=false;
        while (!restar)
        {
            System.out.println("press \"yes\" to restart");
            String Y = sc.nextLine();
            char x = Y.charAt(0);
            if(!(x == 'y'|| x =='Y') )
            {
                System.out.println("thank you, good bye");
                restar=true;

            } else
            {
                driving();
           }


        }}


  }