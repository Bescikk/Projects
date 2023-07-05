import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean Continue = true;
        List<String> history = new ArrayList<>();

        while (Continue) {
            System.out.print("Specify an action (number1 'operator' number2) " +
                    "or type 'history' for operations history or " +
                    "type 'q' to finish: ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                Continue = false;
                System.out.println("Thank you!");
                break;
            } else if (input.equals("history")) {
                System.out.println("Historia działań:");
                for (String operation : history) {
                    System.out.println(operation);
                }
                continue;
            }

            String[] tokens = input.split(" ");
            if (tokens.length != 3) {
                System.out.println("Incorrect operation!");
                continue;
            }

            double number1 = Double.parseDouble(tokens[0]);
            String operator = tokens[1];
            double number2 = Double.parseDouble(tokens[2]);

            double actionResult = 0;
            boolean correctAction = true;

            switch (operator) {
                case "+":
                    actionResult = number1 + number2;
                    break;
                case "-":
                    actionResult = number1 - number2;
                    break;
                case "*":
                    actionResult = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        actionResult = number1 / number2;
                    } else {
                        System.out.println("You can't divide by zero!");
                        correctAction = false;
                    }
                    break;
                case "^":
                    actionResult = Math.pow(number1, number2);
                    break;
                default:
                    System.out.println("Incorrect operator!");
                    correctAction = false;
            }

            if (correctAction) {
                System.out.println("Result: " + actionResult);
                result = actionResult;
                String operation = number1 + " " + operator + " " + number2 + " = " + result;
                history.add(operation);
            }
        }
        scanner.close();
    }
}
