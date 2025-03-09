import java.util.Scanner;

public class BitwiseOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise Odd Or Even");
        System.out.print("Please enter a number: ");
        int num  = scanner.nextInt();


        //Logic
        int result = num & 1;
        if(result == 1){
            System.out.println(num + " is an Odd Number");
        } else {
            System.out.println(num + " is an Even Number");
        }

    }
}

