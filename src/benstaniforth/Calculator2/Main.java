package benstaniforth.Calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to the calculator");
        System.out.println("How many numbers would you like to use?");

        Scanner scanner1 = new Scanner(System.in);
        Integer userQuantity = scanner1.nextInt();

        int selection = 1;

        List <Integer> numbersChosen = new ArrayList<>();

        for (int i = 0; i < userQuantity; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number " + selection++ + " is ");
            Integer n = scanner.nextInt();
            numbersChosen.add(n);
        }


        Calculate result;

        label:
        while (true) {

            System.out.println("Insert a function to perform on the numbers");
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

        System.out.println(numbersChosen);


        // System.out.println("Result = " + result.calculate(numbersChosen,result));

    }

    private static String promptUserForOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


