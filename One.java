import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();
        Calculator calc = new Calculator();
        calc.calculate(a, b, operation);
    }
}

class Calculator {
    void calculate(double a, double b, String op) {
        switch(op) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "sub":
                System.out.println("Result: " + (a - b));
                break;
            case "mul":
                System.out.println("Result: " + (a * b));
                break;
            case "div":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
