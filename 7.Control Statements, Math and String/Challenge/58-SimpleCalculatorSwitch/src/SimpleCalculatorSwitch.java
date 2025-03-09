import java.util.Scanner;

public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the operator: ");
        String operator = scanner.next();
        int result = simpleCalculator(num1, num2, operator);
        System.out.println("Result is: " + result);
    }

    public static int simpleCalculator(int num1, int num2, String operator){
        return switch(operator){
          case "+" ->  num1 + num2 ;
          case "-" ->  num1 - num2 ;
          case "*" ->  num1 * num2 ;
          case "/" ->  num1 / num2 ;
          case "%" ->  num1 % num2 ;
          default -> -1;
        };
    }
}
