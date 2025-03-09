import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Example 1
        /*int num = 1;  //initialization
        while(num <= 10){ //condition
            System.out.println(num);
            num = num + 1; //increment
        }*/

        //Example 2
        /*int num2 = 500;
        while(num2 >= 200){
            System.out.println(num2);
            num2 -= 1;
        }*/

        //Example 3
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        System.out.println("Enter 5 numbers: ");
        while(a <= 5){
           int inp = scanner.nextInt();
            System.out.println("The Number is: "+ inp);
            a++;
        }
    }
}
