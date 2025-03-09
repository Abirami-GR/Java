import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        System.out.println("please enter 5 numbers");
        int x1 =  + scanner.nextInt();
        a += x1;
        System.out.println(a);
        int x2 =  + scanner.nextInt();
        a = a + x2;
        System.out.println(a);
        int x3 =  + scanner.nextInt();
        a = a + x3;
        System.out.println(a);
        int x4 =  + scanner.nextInt();
        a = a + x4;
        System.out.println(a);
        int x5 =  + scanner.nextInt();
        a = a + x5;
        System.out.println(a);
    }
}
