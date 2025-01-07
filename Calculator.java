import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        num2 = sc.nextDouble();
        System.out.println("Enter an operator  (+, -, * ,/ )");
        char operator = sc.next().charAt(0);
        double output = 0;
        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("You have entered the wrong number");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
}
