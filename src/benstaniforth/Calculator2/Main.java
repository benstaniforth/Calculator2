package benstaniforth.Calculator2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to the calculator");
        System.out.println("Please enter two random numbers");

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Number 1 is: ");
        Integer userInput1 = scanner1.nextInt();


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Number 2 is: ");
        Integer userInput2 = scanner2.nextInt();


        Calculate result;

        label:
        while (true) {

            System.out.println("Insert a function to perform on the two numbers");
            System.out.println("You can either add (+), subtract (-) or multiply (*) by entering the operation below");

            String operation = promptUserForOperation();

            switch (operation) {
                case "+":
                    result = new Add();
                    break label;
                case "-":
                    result = new Subtract();
                    break label;
                case "*":
                    result = new Multiply();
                    break label;
                default:
                    System.out.println("This is not a valid input");
                    break;
            }
        }


        System.out.println("Result = " + result.calculate(userInput1, userInput2));

    }

    private static String promptUserForOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


