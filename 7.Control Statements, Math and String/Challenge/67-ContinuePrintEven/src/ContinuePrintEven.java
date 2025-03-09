import java.util.Scanner;

public class ContinuePrintEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print Even Number");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

//        int i = 1;
//        while(i <= num){
//            if(i % 2 != 0){
//                i++;
//                continue;
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        }
//        System.out.println("Out of the Loop");

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }

}
