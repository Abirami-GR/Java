import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Least Common Multiple");
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        int least = lcm(first, second);
        System.out.println("The least common multiple of " + first + " and " + second + " is: " + least);
    }

    public static int lcm(int a , int b){

//        if(a % b == 0){
//            return a;
//        } else if(b % a == 0){
//            return b;
//        } else{
//            int i = 1;
//            while(i <= b){
//                if((a * i) % b == 0){
//                    return(a * i);
//                }
//                i++;
//            }
//        }
//        return 0;// unreachable

        int i = 1;
            while(true){
                int factor = a * i;
                if(factor % b == 0){
                    return factor;
                }
                i++;
            }

    }
}
