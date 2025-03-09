import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime Number");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        boolean prime = findPrimeNumber(num);
        if(prime){
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }

    public static boolean findPrimeNumber(int num){
        int i = 2;
        while (i < num ){
            if(num % i == 0) {
                return false;
            }
            i++;
        }
        return  true;
    }
}
