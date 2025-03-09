import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetUniqueCharacters {
    public static void main(String[] args) {
        System.out.println("Finding Unique Characters");
        Set<Character> unique = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String userStr = scanner.next();

        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Your string has %d Unique Characters" , unique.size());
    }
}
