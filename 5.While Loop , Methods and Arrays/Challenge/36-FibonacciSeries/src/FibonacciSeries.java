import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse The Digits");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Here is your fibonacci series");
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        if(num == 1) return;

        int first = 0;
        int second = 1;

        while((first + second) <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }



    }
}
