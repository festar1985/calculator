package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        // Creating an infinite loop
        do {

            // using Scanner to input the numbers and the function type

            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Number one:");
            int num1 = input1.nextInt();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter function type");
            String sign = input2.nextLine();

            Scanner input3 = new Scanner(System.in);
            System.out.println("Enter Number two:");
            int num2 = input3.nextInt();

            int result;  // creating the result variable in order to use it later

            switch (sign) {
                case "+":
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                    break;

                case "/":
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                    break;

                // catching the case where the user type a function that is not one of the four defined.
                default:
                    System.out.println("Not a valid function sign: " + sign + "\nPlease use +, -, *, /");
                    break;
            }
        } while (true);
    }
}
