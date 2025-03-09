import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println(num + " is a Palindrome ");
        } else{
            System.out.println(num + " is not a Palindrome ");
        }
    }

    public static boolean isPalindrome(int num){
        int realNum = num;
        int value = 0;
        while(num > 0){
            int mod = num % 10;
            value =  (value * 10) + mod;
            //System.out.println(value);
            num /= 10;
        }
        //System.out.println(value);
        return realNum == value;
    }
}
