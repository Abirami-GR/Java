import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication Table");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
