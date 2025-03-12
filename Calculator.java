import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Title
        System.out.println("Simple Calculator");

        //Enter an Expression
        System.out.println("Enter an expression (e.g., 5 + 3): ");
        
        //Enter the input
        String input = scanner.nextLine().trim();
        String[] parts = input.split("\\s+");
        
        //
        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);
        
        //Switch Statement
        double result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> 0;
        };
        
        //Output
        System.out.println("Result: " + result);
        scanner.close();
    }
}