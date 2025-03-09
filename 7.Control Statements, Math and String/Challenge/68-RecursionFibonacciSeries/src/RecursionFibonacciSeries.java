import java.util.Scanner;

public class RecursionFibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Recursive Fibonacci Series");
        System.out.print("Enter the number of elements to be printed: ");
        int count = scanner.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.println(recursionFibonacciSeries(i) + " ");
        }
    }
    public static int recursionFibonacciSeries(int position){
        System.out.print(".");
        if(position == 1){
            return 0;
        }

        if(position == 2){
            return 1;
        }

        return recursionFibonacciSeries(position -1) + recursionFibonacciSeries(position -2);
    }
}
