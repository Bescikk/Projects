package pl.calulator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        boolean repeatInputs = true;
        double firstNumber = 0;
        double secondNumber = 0;
        boolean validFirstInput = true;
        boolean validFirstInput2 = true;

        while (repeat) {
            if (repeatInputs) {
                System.out.println("Give first number: ");
                while (validFirstInput) {
                    try {
                        firstNumber = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a first again number: ");
                        scanner.nextLine();
                        continue;
                    }
                    validFirstInput = false;
                }
                System.out.println("Give second number: ");
                while (validFirstInput2) {
                    try {
                        secondNumber = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a second again number: ");
                        scanner.nextLine();
                        continue;
                    }
                    validFirstInput2 = false;
                }
                repeatInputs = false;
            }
            System.out.println("Choose calculation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Change numbers.");
            System.out.println("6. End");
            int option;
            try {
                option = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input! Please enter a number: ");
                scanner.nextLine();
                continue;
            }
            try {
                switch (option) {
                    case 1 -> System.out.println(firstNumber + secondNumber);
                    case 2 -> System.out.println(firstNumber - secondNumber);
                    case 3 -> System.out.println(firstNumber * secondNumber);
                    case 4 -> System.out.println(firstNumber / secondNumber);
                    case 5 -> {
                        repeatInputs = true;
                        validFirstInput2 = true;
                        validFirstInput = true;
                    }
                    case 6 -> {
                        System.out.println("Thank you for using it!");
                        repeat = false;
                    }
                    default -> System.out.println("You entered wrong number.");
                }
            }
                        catch (InputMismatchException e){
                System.out.println("Invalid input! Please enter a number: ");
                scanner.nextLine();
            }
        }
    }
}