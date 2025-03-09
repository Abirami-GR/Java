import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fahrenheit To Celsius Conversion");
        System.out.print("Enter your Fahrenheit value: ");
        float fah = scanner.nextFloat();

        //Logic
        float cel = (fah - 32) * 5.0f / 9.0f;

        //Output
        System.out.println("The celsius: " + cel + "C");
    }
}
