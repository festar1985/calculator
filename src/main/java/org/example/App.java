package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Number one:");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter function type");
        String sign = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Number two:");
        int num2 = input3.nextInt();

        int result;
     switch (sign)
     {
         case "+":
         result = num1+num2;
         System.out.println("The result is:" + result);
         break;

         case "-":
             result = num1-num2;
             System.out.println("The result is:" + result);
             break;

         case "*":
             result = num1*num2;
             System.out.println("The result is:" + result);
             break;

         case "/":
             result = num1/num2;
             System.out.println("The result is:" + result);
             break;

             default:
             System.out.println("Not a valid funcion sign: " + sign + "\nPlease use +, -, *, /");
     }
    }
}
