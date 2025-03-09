import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse The Digits");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int reversedNum = reverse(num);
        System.out.println("The reversed number is : " + reversedNum);
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit  = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }

        return newNum;
    }
}
