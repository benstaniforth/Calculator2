package benstaniforth.Calculator2;

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


        Calculate result;

        while (true) {

            System.out.println("Insert a function to perform on the two numbers");
            System.out.println("You can either add (+), subtract (-) or multiply (*) by entering the operation below");

            String operation = promptUserForOperation();

            if (operation.equals("+")) {
                result = new Add();
                break;
            } else if (operation.equals("-")) {
                result = new Subtract();
                break;
            } else if (operation.equals("*")) {
                result = new Multiply();
                break;
            } else {
                System.out.println("This is not a valid input");
            }
        }


        System.out.println("Result = " + result.calculate(userInput1, userInput2));

    }

    private static String promptUserForOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


