package benstaniforth.Calculator2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        System.out.println("Below are two random numbers");

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        System.out.println("Number 1 is " + randomNumber);
        System.out.println("Number 2 is " + randomNumber2);

        System.out.println("Insert a function to perform on the two numbers");
        System.out.println("You can either add (+), subtract (-) or multiply (/) by entering the operation below");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int result = 0;
        switch (input) {
            case "+":
                result = randomNumber + randomNumber2;
                break;
            case "-":
                result = randomNumber - randomNumber2;
                break;
            case "/":
                result = randomNumber / randomNumber2;
                break;
            default:
                System.out.println("That is not a valid input");


        }

        System.out.println("Result = " + result);





    }

}
