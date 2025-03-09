import java.util.Scanner;

public class BreakUserInputExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Break User Input when \"Exit\"  ");
        String input;
//        do{
//            System.out.print("Enter the input: ");
//            input = scanner.next();
//        } while(!input.equals("Exit"));

        while(true){
            System.out.print("Enter the input: ");
            input = scanner.next();
//            if(input.equalsIgnoreCase("exit")){
            if(input.equals("exit")){
                break;
            }
        }
        System.out.println("You have Successfully Exited");
    }
}
