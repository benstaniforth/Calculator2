package benstaniforth.Calculator2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        System.out.println("Please enter two random numbers");

        Scanner scanner1 = new Scanner(System.in);
        Integer userInput1 = scanner1.nextInt();
        System.out.println("Number 1 is: " + userInput1);

        Scanner scanner2 = new Scanner(System.in);
        Integer userInput2 = scanner2.nextInt();
        System.out.println("Number 2 is: " + userInput2);

        //Random random = new Random();
        //int randomNumber = random.nextInt(100);
        //int randomNumber2 = random.nextInt(100);
        //System.out.println("Number 1 is " + randomNumber);
        //System.out.println("Number 2 is " + randomNumber2);

        System.out.println("Insert a function to perform on the two numbers");
        System.out.println("You can either add (+), subtract (-) or multiply (*) by entering the operation below");

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();

        int result = 0;
        switch (operation) {
            case "+":
                result = userInput1 + userInput2;
                break;
            case "-":
                result = userInput1 - userInput2;
                break;
            case "*":
                result = userInput1 * userInput2;
                break;
            default:
                System.out.println("That is not a valid input");


        }

        System.out.println("Result = " + result);





    }

}
