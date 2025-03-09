import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greatest Common Divisor");
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        int greatest = gcd(first, second);
        System.out.println("The least common multiple of " + first + " and " + second + " is: " + greatest);
    }

    public static int gcd(int first , int second){
        int smaller = smaller(first, second);
        int gcd = 1;
        int i = 2;
        while(i <= smaller){
            if((first % i == 0) && (second % i == 0 )){
                gcd =  i;
            }
            i++;
        }

        return gcd;
    }

    public static int smaller(int first, int second){
        if(first < second) {
            return first;
        } else{
            return second;
        }
    }
}
