import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("Enter an expression (e.g., 5 + 3): ");
        
        String input = scanner.nextLine().trim();
        String[] parts = input.split("\\s+");
        
        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);
        
        double result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> 0;
        };
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}