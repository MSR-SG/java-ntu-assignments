import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * This class is a simple calculator, to take console input and give console output.
 */
public class SimpleCalculator {

    // "0.0##" always shows at least 1 decimal place, up to 3, to avoid scientific notation using E
    private static final DecimalFormat RESULT_FORMAT = new DecimalFormat("0.0##");

    private static boolean continueCalculation = true; // flag to control the loop for continuous calculations
     /*
     * This method runs the simple calculator.
     */
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);   // single shared scanner for the program's lifetime.

        do {                                        // run at least once.
            calculate(scanner);                     // calculate method.

            String userResponse = readYorN(scanner, "Do you want to continue calculating? (Y/N): ");
            continueCalculation = userResponse.trim().toUpperCase().equals("Y");
        } while (continueCalculation);
        
        scanner.close();                        // close the scanner once, when the program is done.
    }

    /*
     * This method performs a calculation based on user console input.
     * It prompts the user to enter two numbers and an operator,
     * then displays the result of the calculation on console.
     */
    public static void calculate(Scanner scanner)
    {
        double num1, num2, result;                  // use double to allow decimal numbers in calculation.
        String operator;
        num1 = readDouble(scanner, "Enter first number: ");
        num2 = readDouble(scanner, "Enter second number: ");
        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next();
        scanner.nextLine();                          // consume leftover newline so the next nextLine() isn't empty.
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero will cause an error.");
                    return;
                }
                break;
            default:
                System.out.println("Your input is invalid.");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + RESULT_FORMAT.format(result));
    }

    /*
     * Seeks a valid input with message, until user enters a valid integer or double value,
     * instead of exiting the calculation for invalid input.
     */
    private static double readDouble(Scanner scanner, String prompt)
    {
        while (true) {
            System.out.print(prompt);
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();                  // consume leftover newline.
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer or double value.");
                scanner.nextLine();                  // discard the invalid token so it isn't re-read.
            }
        }
    }

    /*
     * Seeks a Y or N input with message, until user enters a valid value,
     * instead of exiting the calculation for invalid input.
     */
    private static String readYorN(Scanner scanner, String prompt)
    {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim().toUpperCase();
            if (value.equals("Y") || value.equals("N")) {
                return value;
            } else {
                System.out.println("Please enter Y or N.");
            }
        }
    }

}