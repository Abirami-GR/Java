import java.util.Scanner;

public class ForPrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime or not");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Your Number is " + (isPrimeOrNot(num) ? "Prime" : "Not Prime"));
    }
    public static boolean isPrimeOrNot(int num){
        for(int i = 2; i < num; i++ ){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
