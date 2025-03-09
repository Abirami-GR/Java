import java.util.Scanner;

public class RecursionPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Recursion Palindrome");
        System.out.print("Enter the string: ");
        String str = scanner.next();
        boolean isRecursive = isRecursivePalindrome(str);
        System.out.println("Your String is "
                + (isRecursivePalindrome(str) ? "Palindrome"
                                              : "not a Palindrome"));
    }

    public static boolean isRecursivePalindrome(String str){
        if(str.length() <= 1){
            return  true;
        }

        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
          return false;
        }
        String newStr = str.substring(1,lastPos);
        return  isRecursivePalindrome(newStr);
    }
}
