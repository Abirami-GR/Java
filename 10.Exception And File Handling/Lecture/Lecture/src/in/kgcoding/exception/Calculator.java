package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Exceptional Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int second = scanner.nextInt();

        try {
            int[] a = new int[5];
            //System.out.printf("Result is: %d", a[6]);
            //a[6] = first / second;
            System.out.printf("Result is: %d", a[6]);
        //} catch (ArithmeticException exception){
          //  System.out.printf("%s,  Enter valid value", exception.getMessage());
        } /* catch (ArrayIndexOutOfBoundsException exc){
            System.out.printf("%s, Invalid Index", exc.getMessage());
        } */ catch(Throwable th){
            System.out.println("General Exception");
            throw th;
        }
    }
}
