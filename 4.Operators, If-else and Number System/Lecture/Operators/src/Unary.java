public class Unary {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of X: " + x);
        int y = -x;
        System.out.println("The value of Y: " + y);
        int z = -y;
        System.out.println("The value of Z: " + z);

        int a = 5;
        a = a + 1;
        System.out.println("Value of A: " + a);
        a += 1;
        System.out.println("Value of A: " + a);
        a++;
        System.out.println("Value of A: " + a);
        ++a;
        System.out.println("Value of A: " + a);

        System.out.println("Watching Increment");
        int p = 5;
        System.out.println("Value of P: " + p++);
        System.out.println("Value of P: " + p);
        System.out.println("Value of P: " + ++p);
        System.out.println("Value of P: " + p);

        System.out.println("Watching Decrement");
        int q = 10 ;
        System.out.println("Value of Q: " + --q);
        System.out.println("Value of Q: " + q);

        System.out.println("Value of Q: " + q--);
        System.out.println("Value of Q: " + q);
    }
}
